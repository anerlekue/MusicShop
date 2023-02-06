package Main;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import classes.Producto;
import classes.Usuario;
import config.BD;

import ui.VentanaLogin;

public class Main {

	private static final Logger logger = Logger.getLogger(Main.class.getName());

	private static BD db;
	private static Scanner scanner = new Scanner(System.in);
	public static ArrayList<Producto> pedido;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pedido = new ArrayList<Producto>();
					VentanaLogin frame = new VentanaLogin();
					// user: azparren
					// pass: elina
					frame.setVisible(true);
				} catch (Exception e) {
					logger.warning(e.getMessage());
				}
			}
		});

		db = new BD();
		db.crearBBDD();
	
		//Se abre el fichero usando la utilizadad "try-catch with closeable resources"
		//NOTA: la ruta relativa exige que el fichero CVS se ponga en la carpeta data.
		try (BufferedReader in = new BufferedReader(new FileReader("data/listaUsuarios.csv"))) {
			String linea;
			List<Usuario> usuarios = new ArrayList<>();
			
			//Lectura saltar la cabecera del fichero CSV.
			in.readLine();
			
			//Se leen líneas hasta llegar al final del fichero.
			while( (linea = in.readLine()) != null ) {
				//Se trasnforma cada línea en un objeto User y se añade a la lista.
				usuarios.add(Usuario.parseCSV(linea));
			}
			
			//Se recorre la lista de usuarios y se muestra su contenido por pantalla.
			for(Usuario Usuario : usuarios) {
				System.out.println(Usuario);
			}
			
		} catch(Exception ex) {
			System.err.println(String.format("Error en el main: %s", ex.getMessage()));
		}
}


	


	public void ejecutarLogin() {
		

	}
}