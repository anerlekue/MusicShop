package Main;

import Main.classes.Usuario;
import Main.config.BD;
import Main.ui.VentanaLogin;

public class Main {
	
	private static BD db;
	
	public static void main(String[] args) {
		VentanaLogin frame = new VentanaLogin();
		frame.setVisible(true);
		
		
		db = new BD();

		db.crearBBDD();
		db.actualizarPassword(null, null);
		db.crearBBDD();
		db.obtenerDatos();

		Usuario user1 = new Usuario();
		db.insertarDatos(user1);
		System.out.println("dato insertado");

		
		


	}

}
