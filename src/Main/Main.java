package Main;

import java.awt.EventQueue;
import java.util.logging.Logger;

import classes.Usuario;
import config.BD;
import ui.VentanaLogin;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class.getName());

	private static BD db;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					logger.warning(e.getMessage());
				}
			}
		});

		db = new BD();
		db.crearBBDD();
		
		//Es necesario crear un objeto de tipo usuario
		Usuario user = new Usuario();
		user.setNombre("Peter");
		user.setApellido("Parker");
		user.setDni("35678293R");
		user.setEmail("spiderman@gmail.com");
		user.setContrasena("€sp1d3rm4n");		
		db.insertarDatos(user);
		
		db.actualizarPassword(user, "€sp1d€rm4n2023");
		System.out.println("dato insertado");
	}

	public void ejecutarLogin() {

	}
}