package Main.classes;

public class Administrador {
	
	private String usuario;
	private String contrasena;
	
	
	

	public Administrador(String usuario, String contrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
	public Administrador() {
		super();
		this.usuario = "";
		this.contrasena = "";
	}

	
	public Administrador(Administrador a) {
		super();
		this.usuario = a.usuario;
		this.contrasena = a.contrasena;
	}

	


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

	@Override
	public String toString() {
		return "Administrador [usuario=" + usuario + ", contrasena=" + contrasena + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
