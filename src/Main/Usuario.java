package Main;

public class Usuario {
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private String contrasena;
	
	
	
	
		

	public Usuario(String dni, String nombre, String apellido, String email, String contrasena) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contrasena = contrasena;
	}



	public Usuario() {
		super();
		this.dni = "";
		this.nombre = "";
		this.apellido = "";
		this.email = "";
		this.contrasena = "";
	}



	public Usuario(Usuario u) {
		super();
		this.dni = u.dni;
		this.nombre = u.nombre;
		this.apellido = u.apellido;
		this.email = u.email;
		this.contrasena = u.contrasena;
	}






	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getContrasena() {
		return contrasena;
	}



	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}



	@Override
	public String toString() {
		return "Usuario [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", contrasena=" + contrasena + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
