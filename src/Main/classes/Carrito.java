package Main.classes;

public class Carrito {
	
	private int id;
	private String nombre;
	private String fecha;
	private int precio;

	public Carrito(int id, String nombre, String fecha, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.precio = precio;
	}
	
	public Carrito() {
		super();
		this.id = 0;
		this.nombre = "";
		this.fecha = "";
		this.precio = 0;
	}
	
	public Carrito(Carrito c) {
		super();
		this.id = c.id;
		this.nombre = c.nombre;
		this.fecha = c.fecha;
		this.precio = c.precio;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

	@Override
	public String toString() {
		return "Carrito [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", precio=" + precio + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
