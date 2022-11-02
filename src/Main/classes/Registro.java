package Main.classes;

public class Registro {

	private String correoRegistro;
	private String contrasenaRegistro;
	
	public Registro( String contrasenaRegistro, String correoRegistro) {
		super();
		this.contrasenaRegistro = contrasenaRegistro;
		this.correoRegistro = correoRegistro;
	}
	
	public Registro() {
		super();
		this.contrasenaRegistro = "";
		this.correoRegistro = "";
	}
	

	public Registro(Registro r) {
		super();
		this.contrasenaRegistro = r.contrasenaRegistro;
		this.correoRegistro = r.correoRegistro;
	}
	
	
	public String getCorreoRegistro() {
		return correoRegistro;
	}


	public void setCorreoRegistro(String correoRegistro) {
		this.correoRegistro = correoRegistro;
	}



	public String getContrasenaRegistro() {
		return contrasenaRegistro;
	}


	public void setContrasenaRegistro(String contrasenaRegistro) {
		this.contrasenaRegistro = contrasenaRegistro;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
}
