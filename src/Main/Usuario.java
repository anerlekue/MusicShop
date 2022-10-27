package Main;

public class Usuario {

	private String nombre;
	private String apellido;
	private int edad;
	
	
		
	public Usuario(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	public Usuario() {
		super();
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
	}

	
	
	public Usuario(Usuario u) {
		super();
		this.nombre = u.nombre;
		this.apellido = u.apellido;
		this.edad = u.edad;
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
