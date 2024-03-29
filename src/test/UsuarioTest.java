package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Usuario;
import config.BD;

public class UsuarioTest {
	
	private BD db;
	private Usuario usuario;
	private String dni = "dni";
	private String nombre = "nombre";
	private String email = "email";
	private String contrasena = "contrasena";
	

	@Before
	public void setUp() throws Exception{
		usuario = new Usuario();
	}
	
	@After
	public void tearDown() throws Exception {
		usuario = null;
	}
	
	@Test
	public void testUsuario() {
		assertNotNull(usuario);
		assertEquals(dni, usuario.getDni());
		assertEquals(nombre, usuario.getNombre());
		assertEquals(email, usuario.getEmail());
		assertEquals(contrasena, usuario.getContrasena());
	}
	
	
	
	
	@Test
	public void testGetDni() {
		assertEquals(dni, usuario.getDni());
	}
	
	@Test
	public void testSetDni() {
		String newDni = " New dni";
		usuario.setDni(newDni);
		
		assertEquals(newDni, usuario.getDni());
	}
	@Test
	public void testGetNombre() {
		assertEquals(nombre, usuario.getNombre());
	}
	
	@Test
	public void testSetNombre() {
		String newNombre = " New nombre";
		usuario.setNombre(newNombre);
		
		assertEquals(newNombre, usuario.getNombre());
	}
	
	@Test
	public void testGetEmail() {
		assertEquals(email, usuario.getEmail());
	}
	
	@Test
	public void testSetEmail() {
		String newEmail = " New email";
		usuario.setEmail(newEmail);
		
		assertEquals(newEmail, usuario.getEmail());
	}
	@Test
	public void testGetContrasena() {
		assertEquals(contrasena, usuario.getContrasena());
	}
	
	@Test
	public void testSetContrasena() {
		String newContrasena = " New contrasena";
		usuario.setContrasena(newContrasena);
		
		assertEquals(newContrasena, usuario.getContrasena());
	}
	
	
}

