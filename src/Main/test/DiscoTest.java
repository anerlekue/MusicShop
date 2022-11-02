package Main.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.classes.Disco;

public class DiscoTest {

private Disco d;
	
	
	@Before
	public void setup() {
		d = new Disco("Michael Jackson", 35, "1999");
	}
	
	
	@Test
	public void testGetSetNombre() {
		assertEquals("Michael Jackson", d.getNombre());
	}
	
	
	
	@Test
	public void testGetSetPrecio() {
		assertEquals(35, d.getPrecio());
	}
	 
	
	
	@Test
	public void testGetSetFechaSalida() {
		assertEquals("1999", d.getFechaSalida());
	}
	
	

}
