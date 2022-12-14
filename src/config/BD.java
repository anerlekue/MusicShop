package config;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


import classes.Usuario;


public class BD {
 
		protected static final String DRIVER_NAME = "sqlite-jdbc";
		protected static final String DATABASE_FILE = "db/BD.db";
		protected static final String CONNECTION_STRING = "jdbc:sqlite:" + DATABASE_FILE;
		
		public BD() {		
			try {
				Class.forName(DRIVER_NAME);
			} catch (ClassNotFoundException ex) {
				System.err.println(String.format("* No carga el driver de BBDD: %s", ex.getMessage()));
				ex.printStackTrace();
			}
		}	
		public void crearBBDD() {
			//Crea la conexion y el statemment
			try (Connection con = DriverManager.getConnection(CONNECTION_STRING);
			     Statement stmt = con.createStatement()) {
				
		        String sql = "CREATE TABLE IF NOT EXISTS USUARIO (\n"
		                   + " ID INTEGER PRIMARY KEY AUTOINCREMENT,\n"
		                   + " DNI TEXT NOT NULL,\n"
		                   + " NAME TEXT NOT NULL,\n"
		                   + " EMAIL TEXT NOT NULL,\n"
		                   + " PASSWORD TEXT NOT NULL\n"
		                   + ");";
		        	        
		        if (!stmt.execute(sql)) {
		        	System.out.println("- Se ha creado la tabla Usuario");
		        }
			} catch (Exception ex) {
				System.err.println(String.format("* Error al crear la BBDD: %s", ex.getMessage()));
				ex.printStackTrace();			
			}
		}
		public List<Usuario> obtenerDatos() {
			List<Usuario> usuarios = new ArrayList<>();
			
			//Se abre la conexión y se obtiene el Statement
			try (Connection con = DriverManager.getConnection(CONNECTION_STRING);
			     Statement stmt = con.createStatement()) {
				String sql = "SELECT * FROM USUARIO WHERE ID >= 0";
				
				//Se ejecuta la sentencia y se obtiene el ResultSet con los resutlados
				ResultSet rs = stmt.executeQuery(sql);			
				Usuario usuario;
				
				//Se recorre el ResultSet y se crean objetos Cliente
				while (rs.next()) {
					usuario = new Usuario();		
					usuario.setId(rs.getInt("ID"));
					usuario.setDni(rs.getString("DNI"));
					usuario.setNombre(rs.getString("NOMBRE"));
					usuario.setEmail(rs.getString("EMAIL"));
					usuario.setContrasena(rs.getString("PASSWORD"));
					
					//Se inserta cada nuevo cliente en la lista de clientes
					usuarios.add(usuario);
				}
				
				//Se cierra el ResultSet
				rs.close();
				
				System.out.println(String.format("- Se han recuperado %d usuarios...", usuarios.size()));			
			} catch (Exception ex) {
				System.err.println(String.format("* Error al obtener datos de la BBDD: %s", ex.getMessage()));
				ex.printStackTrace();						
			}			
			return usuarios;
		}
		public void actualizarPassword(Usuario usuario, String newPassword) {
			//Se abre la conexión y se obtiene el Statement
			try (Connection con = DriverManager.getConnection(CONNECTION_STRING);
			     Statement stmt = con.createStatement()) {
				//Se ejecuta la sentencia de borrado de datos
				String sql = "UPDATE USUARIO SET PASSWORD = '%s' WHERE ID = %d;";
				
				int result = stmt.executeUpdate(String.format(sql, newPassword, usuario.getId()));
				
				System.out.println(String.format("- Se ha actulizado %d Usuario", result));
			} catch (Exception ex) {
				System.err.println(String.format("* Error actualizando datos de la BBDD: %s", ex.getMessage()));
				ex.printStackTrace();						
			}		
		}
		public void borrarDatos() {
			//Se abre la conexión y se obtiene el Statement
			try (Connection con = DriverManager.getConnection(CONNECTION_STRING);
			     Statement stmt = con.createStatement()) {
				//Se ejecuta la sentencia de borrado de datos
				String sql = "DELETE FROM USUARIO;";			
				int result = stmt.executeUpdate(sql);
				
				System.out.println(String.format("- Se han borrado %d usuarios", result));
			} catch (Exception ex) {
				System.err.println(String.format("* Error al borrar datos de la BBDD: %s", ex.getMessage()));
				ex.printStackTrace();						
			}		
		}
		public void insertarDatos(Usuario... usuarios ) {
			//Se abre la conexión y se obtiene el Statement
			try (Connection con = DriverManager.getConnection(CONNECTION_STRING);
			     Statement stmt = con.createStatement()) {
				//Se define la plantilla de la sentencia SQL
				String sql = "INSERT INTO USUARIO (DNI, NAME, EMAIL, PASSWORD) VALUES ('%s', '%s', '%s', '%s');";
				
				System.out.println("- Insertando Usuario...");
				
				for (Usuario u : usuarios) {
					if (1 == stmt.executeUpdate(String.format(sql, u.getDni(), u.getNombre(), u.getEmail(), u.getContrasena()))) {					
						System.out.println(String.format(" - Usuario insertado: %s", u.toString()));
					} else {
						System.out.println(String.format(" - No se ha insertado el Usuario: %s", u.toString()));
					}
				}			
			} catch (Exception ex) {
				System.err.println(String.format("* Error al insertar datos de la BBDD: %s", ex.getMessage()));
				ex.printStackTrace();						
			}				
		}
		public static int buscarUsuario(String Nombre, String contrasenya) {
			int resultado = 0;
			try (Connection con = DriverManager.getConnection(CONNECTION_STRING);
				    Statement stmt = con.createStatement()) {
					String query = "SELECT * FROM USUARIO WHERE Nombre='" + Nombre + "'";
					ResultSet rs = stmt.executeQuery(query);
				if (rs.next()) {
					String cl = rs.getString(3);
					if (cl.equals(contrasenya)) {
						resultado = 1;
					} else {
						resultado = 2;
					}
				} else {
					resultado = 0;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return resultado;

		}
		public static void registrarUsuario(String DNI, String nombre, String email, String contrasenya) {
			
			try (Connection con = DriverManager.getConnection(CONNECTION_STRING);
				    Statement stmt = con.createStatement()) {
					String query = "INSERT INTO USUARIO VALUES('"+ DNI +"','"+ nombre + "','" + email + "','" + contrasenya + "')";
					ResultSet rs = stmt.executeQuery(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static Logger logger = null;
	
		public static void setLogger( Logger logger ) {
			BD.logger = logger;
		}
		// Metodo local para loggear
		private static void log( Level level, String msg, Throwable excepcion ) {
			if (logger==null) {  // Logger por defecto local:
				logger = Logger.getLogger( BD.class.getName() );  // Nombre del logger 
				logger.setLevel( Level.ALL );  // Loguea todos los niveles
				try {
					
					logger.addHandler( new FileHandler( "BD.log.xml", true ) );  // Y saca el log a fichero xml
				} catch (Exception e) {
					logger.log( Level.SEVERE, "No se pudo crear fichero de log", e );
				}
			}
			if (excepcion==null)
				logger.log( level, msg );
			else
				logger.log( level, msg, excepcion );
		}
		

}

