package classes;

import java.util.StringTokenizer;



public class Usuario {
	private int id = -1;
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private String contrasena;
	
	public Usuario() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Usuario [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", contrasena=" + contrasena + "]";
	}

	public static Usuario parseCSV(String linea) {
		StringTokenizer tokenizer = new StringTokenizer(linea, ",");
		Usuario usuario = new Usuario();
		
		usuario.setDni(tokenizer.nextToken());
		usuario.setNombre(tokenizer.nextToken());
		usuario.setApellido(tokenizer.nextToken());
		usuario.setEmail(tokenizer.nextToken());
		usuario.setContrasena(tokenizer.nextToken());
		
		return usuario;
	}
	
	
	
	
	
		

	
}
