package Main;

import java.awt.EventQueue;
import java.lang.System.Logger.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import Main.classes.Usuario;
import Main.config.BD;
import Main.ui.VentaanaLogin;

public class Main {
	
	private static final Logger logger = LogManager.getLogger(Main.class);

	
	private static BD db;
	
	public static void main(String[] args) {
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						VentaanaLogin frame = new VentaanaLogin();
						frame.setVisible(true);
					} catch (Exception e) {
						logger.warn(Level.WARNING, e);
					}
				}
			});
		

		
		
		db = new BD();

		db.crearBBDD();
		db.actualizarPassword(null, null);
		db.crearBBDD();
		db.obtenerDatos();

		Usuario user1 = new Usuario();
		db.insertarDatos(user1);
		System.out.println("dato insertado");
	}

	
	public void ejecutarLogin() {
		   
	}

}
