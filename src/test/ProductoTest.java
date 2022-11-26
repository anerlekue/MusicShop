package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Producto;

public class ProductoTest {
	private Producto p;
	
	
	//construir objeto con atributos
	@Before
	public void setup() {
		p = new Producto("id", "nombre", 30, "tipo");
	}
	
	
	
	//Test nombre producto
	@Test
	public void testGetSetNombre() {
		assertEquals("nombre", p.getNombre());
	}
	
	//Test precio producto
	
	@Test
	public void testGetSetPrecio() {
		assertEquals(30, p.getPrecio());
	}
	 
	//Test id producto
	
	@Test
	public void testGetSetId() {
		assertEquals("id", p.getId());
	}
	
	
	@Test
	public void testGetSetTipo() {
		assertEquals("tipo", p.getTipo());
	}
	
	@Test
	public void testToString() {
		assertEquals("id" + ":nombre" + ", Precio:30 "
				+ " tipo |", p.toString());
	}

}
