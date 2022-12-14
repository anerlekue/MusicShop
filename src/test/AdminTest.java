package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Administrador;

public class AdminTest {

private Administrador a;
	
	
	@Before
	public void setup() {
		a= new Administrador("Yonan", "Yonan123");
	}
	
	
	@Test
	public void testGetSetNombre() {
		assertEquals("Yonan27", a.getUsuario());
	}
	
	
	
	@Test
	public void testGetSetContrasena() {
		assertEquals("Yonan123", a.getContrasena());
	}
	 
	
	
	
	
	

}