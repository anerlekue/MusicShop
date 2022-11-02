package Main.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import Main.classes.Instrumento;

public class InstrumentoTest {

private Instrumento i;
	
	
	@Before
	public void setup() {
		i = new Instrumento("Cuerda", "XL", 25);
	}
	
	
	@Test
	public void testGetSetTipo() {
		assertEquals("Cuerda", i.getTipo());
	}
	
	
	
	@Test
	public void testGetSetModelo() {
		assertEquals("XL", i.getModelo());
	}
	 
	
	
	@Test
	public void testGetSetPrecio() {
		assertEquals(25, i.getPrecio());
	}
	
	

}