package Main;

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
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