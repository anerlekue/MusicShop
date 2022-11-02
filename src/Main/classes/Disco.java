package Main.classes;

public class Disco {
	private String nombre;
	private int precio;
	private String fechaSalida;
	
	

	


	public Disco(String nombre, int precio, String fechaSalida) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.fechaSalida = fechaSalida;
	}


	public Disco() {
		super();
		this.nombre = "";
		this.precio = 0;
		this.fechaSalida = "";
	}
	
	public Disco(Disco d) {
		super();
		this.nombre = d.nombre;
		this.precio = d.precio;
		this.fechaSalida = d.fechaSalida;
	}





	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	
	

	@Override
	public String toString() {
		return "Disco [nombre=" + nombre + ", precio=" + precio + ", fechaSalida=" + fechaSalida + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
