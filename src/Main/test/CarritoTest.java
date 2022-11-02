package Main.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Main.classes.Carrito;

public class CarritoTest {
	private Carrito c;

	//Construir objeto con atributos
	@Before
	public void setup() {
		c = new Carrito(0,"nombre","fecha",30);
	}
	
	//Test id del carrito
	@Test
	public void testGetSetId() {
		assertEquals(0, c.getId());
	}
	
	//Test nombre del carrito
	@Test
	public void testGetSetNombre() {
		assertEquals("nombre",c.getNombre());
	}
	
	//Test fecha del carrito
	@Test
	public void testGetSetFecha() {
		assertEquals("fecha",c.getFecha());
		}
	
	//Test nombre del carrito
	@Test
	public void testGetSetPrecio() {
		assertEquals(30,c.getPrecio());
		}
		
		
	
}
