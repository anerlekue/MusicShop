package Main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BD {
 
		protected static final String DRIVER_NAME = "org.sqlite.JDBC";
		protected static final String DATABASE_FILE = "db/database.db";
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
		                   + " NAME TEXT NOT NULL,\n"
		                   + " EMAIL TEXT NOT NULL,\n"
		                   + " EDAD INT NOT NULL,\n"
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
		
	}
