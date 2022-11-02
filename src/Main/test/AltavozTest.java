package Main.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.classes.Altavoz;


public class AltavozTest {
	private Altavoz a;
	
	
	@Before
	public void setup() {
		a = new Altavoz("intelc7", 005, 50);
	}
	
	
	@Test
	public void testGetSetModelo() {
		assertEquals("intelc7", a.getModelo());
	}
	
	
	
	@Test
	public void testGetSetNumeroSerie() {
		assertEquals(005, a.getNumeroSerie());
	}
	 
	
	
	@Test
	public void testGetSetPrecio() {
		assertEquals(50, a.getPrecio());
	}
	
	
	

}