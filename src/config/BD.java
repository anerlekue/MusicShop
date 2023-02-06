package config;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import config.BD;
import classes.Producto;
import classes.Usuario;

public class BD {

	protected static final String DRIVER_NAME = "org.sqlite.JDBC";
	protected static final String DATABASE_FILE = "BD.db";
	protected static final String CONNECTION_STRING = "jdbc:sqlite:" + DATABASE_FILE;
	private BD db;
	
	public BD() {
		this.db= db;
	}
	
	
	public void concon() {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException ex) {
			System.err.println(String.format("* No carga el driver de BBDD: %s", ex.getMessage()));
			ex.printStackTrace();
		}
	}

	public void crearBBDD() {
		// Crea la conexion y el statemment
		try (Connection con = DriverManager.getConnection(CONNECTION_STRING); Statement stmt = con.createStatement()) {

			String sql = "CREATE TABLE IF NOT EXISTS USUARIO (\n" + " ID INTEGER PRIMARY KEY AUTOINCREMENT,\n"
					+ " DNI TEXT NOT NULL,\n" + " NAME TEXT NOT NULL,\n" + " EMAIL TEXT NOT NULL,\n"
					+ " PASSWORD TEXT NOT NULL\n" + ");";

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

		// Se abre la conexión y se obtiene el Statement
		try (Connection con = DriverManager.getConnection(CONNECTION_STRING); Statement stmt = con.createStatement()) {
			String sql = "SELECT * FROM USUARIO WHERE ID >= 0";

			// Se ejecuta la sentencia y se obtiene el ResultSet con los resutlados
			ResultSet rs = stmt.executeQuery(sql);
			Usuario usuario;

			// Se recorre el ResultSet y se crean objetos Cliente
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt("ID"));
				usuario.setDni(rs.getString("DNI"));
				usuario.setNombre(rs.getString("NOMBRE"));
				usuario.setEmail(rs.getString("EMAIL"));
				usuario.setContrasena(rs.getString("PASSWORD"));

				// Se inserta cada nuevo cliente en la lista de clientes
				usuarios.add(usuario);
			}

			// Se cierra el ResultSet
			rs.close();

			System.out.println(String.format("- Se han recuperado %d usuarios...", usuarios.size()));
		} catch (Exception ex) {
			System.err.println(String.format("* Error al obtener datos de la BBDD: %s", ex.getMessage()));
			ex.printStackTrace();
		}
		return usuarios;
	}

	public void actualizarPassword(Usuario usuario, String newPassword) {
		// Se abre la conexión y se obtiene el Statement
		try (Connection con = DriverManager.getConnection(CONNECTION_STRING); Statement stmt = con.createStatement()) {
			// Se ejecuta la sentencia de borrado de datos
			String sql = "UPDATE USUARIO SET contrasenya = '%s' WHERE ID = %d;";

			int result = stmt.executeUpdate(String.format(sql, newPassword, usuario.getId()));

			System.out.println(String.format("- Se ha actulizado %d Usuario", result));
		} catch (Exception ex) {
			System.err.println(String.format("* Error actualizando datos de la BBDD: %s", ex.getMessage()));
			ex.printStackTrace();
		}
	}

	public void borrarDatos() {
		// Se abre la conexión y se obtiene el Statement
		try (Connection con = DriverManager.getConnection(CONNECTION_STRING); Statement stmt = con.createStatement()) {
			// Se ejecuta la sentencia de borrado de datos
			String sql = "DELETE FROM USUARIO;";
			int result = stmt.executeUpdate(sql);

			System.out.println(String.format("- Se han borrado %d usuarios", result));
		} catch (Exception ex) {
			System.err.println(String.format("* Error al borrar datos de la BBDD: %s", ex.getMessage()));
			ex.printStackTrace();
		}
	}
	
	public int insertarProducto(Producto p) {
		try (Connection con = DriverManager.getConnection(CONNECTION_STRING); Statement stmt = con.createStatement()){
			String sql = "INSERT INTO PRODUCTOS (Nombre, Tipo, Precio, Id) VALUES ('%s', '%s', '%d', '%s');";
			if (1 == stmt.executeUpdate(String.format(sql, p.getNombre(), p.getTipo(), p.getPrecio(), p.getId()))) {
				System.out.println(String.format(" - Producto insertado: %s", p.toString()));
				return 1;
			}
		    else {
		    	System.out.println(String.format(" - No se ha insertado el Producto: %s", p.toString()));
		    }
		} catch (Exception e) {
			System.err.println(String.format("* Error al insertar datos de la BBDD: %s", e.getMessage()));
			e.printStackTrace();
		}
		return 0;
	}

	public int insertarDatos(Usuario... usuarios) {
		// Se abre la conexión y se obtiene el Statement
		try (Connection con = DriverManager.getConnection(CONNECTION_STRING); Statement stmt = con.createStatement()) {
			// Se define la plantilla de la sentencia SQL
			String sql = "INSERT INTO USUARIO (DNI, Nombre, email, contrasenya) VALUES ('%s', '%s', '%s', '%s');";

			System.out.println("- Insertando Usuario...");

			for (Usuario u : usuarios) {
				if (1 == stmt.executeUpdate(
						String.format(sql, u.getDni(), u.getNombre(), u.getEmail(), u.getContrasena()))) {
					System.out.println(String.format(" - Usuario insertado: %s", u.toString()));
					return 1;
				} else {
					System.out.println(String.format(" - No se ha insertado el Usuario: %s", u.toString()));
				}
			}
		} catch (Exception ex) {
			System.err.println(String.format("* Error al insertar datos de la BBDD: %s", ex.getMessage()));
			ex.printStackTrace();
		}
		return 0;
	}

	public static int buscarUsuario(String Nombre, String contrasenya) {
		int resultado = 0;
		try (Connection con = DriverManager.getConnection(CONNECTION_STRING); Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM USUARIO WHERE Nombre='" + Nombre + "'";
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				String cl = rs.getString(5);
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

	public static void registrarUsuario(Usuario usuario) {

		try (Connection con = DriverManager.getConnection(CONNECTION_STRING)) {
			String query = "INSERT INTO USUARIO(DNI, Nombre, email, contrasenya) VALUES (?, ?, ?, ?);";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			System.out.println(usuario.toString());
            pst.setString(1, usuario.getDni());
            pst.setString(2, usuario.getNombre());
            pst.setString(3, usuario.getEmail());
            pst.setString(4, usuario.getContrasena());
            
            pst.executeUpdate();
            pst.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Logger logger = null;  

	public static void setLogger( Logger logger ) {
		BD.logger = logger;
	}
	// M�todo local para loggear (si no se asigna un logger externo, se asigna uno local)
	private static void log( Level level, String msg, Throwable excepcion ) {
		if (logger==null) {  // Logger por defecto local:
			logger = Logger.getLogger( BD.class.getName() );  // Nombre del logger - el de la clase
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
	
	public void cargaProductos() throws SQLException, IOException {
        BufferedReader csvReader = new BufferedReader(new FileReader("productos.csv"));
        Connection con = DriverManager.getConnection(CONNECTION_STRING);
        try (PreparedStatement stmt = con.prepareStatement("INSERT INTO PRODUCTOS (Nombre, Tipo, Precio, Id) VALUES (?, ?, ?, ?)")) {
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                stmt.setString(1, data[0]);
                stmt.setString(2, data[1]);
                stmt.setInt(3, Integer.parseInt(data[2].trim()));
                stmt.setString(4, data[3]);          
                stmt.executeUpdate();
            }
            csvReader.close();
        }  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Producto> getProducto() throws SQLException, IOException{
		Connection con = DriverManager.getConnection(CONNECTION_STRING);
		ArrayList<Producto> ret = new ArrayList<>();
		try (Statement statement = con.createStatement()) {	
			String sent = "select * from PRODUCTOS;";
			ResultSet rs = statement.executeQuery( sent );
			while( rs.next() ) {
				String Nombre = rs.getString("Nombre");
				String Tipo = rs.getString("Tipo");
				Integer Precio = rs.getInt("Precio");
				String Id = rs.getString("Id");
				ret.add( new Producto (Nombre, Tipo, Precio, Id) );
			}
			
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return ret;
	}
}
