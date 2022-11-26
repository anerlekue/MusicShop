package classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Producto {
	private String id;
	private String nombre;
	private int precio;
	private String tipo;
	
	

	public Producto(String id, String nombre, int precio, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
	}
	public Producto() {
		super();
		this.id = "";
		this.nombre = "";
		this.precio = 0;
		this.tipo= "";
	}
	
	public Producto(Producto p) {
		super();
		this.id = p.id;
		this.nombre = p.nombre;
		this.precio = p.precio;
		this.tipo = p.tipo;
	}




	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
