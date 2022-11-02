package Main.classes;

public class Registro {

	private String correoRegistro;
	private Striing contrasenaRegistro;
	
	public Login( String contrasenaRegistro, String correoRegistro {
		super();
		this.contrasenaRegistro = contrasenaRegistro;
		this.correoRegistro = correoRegistro;
	}
	
	public Login() {
		super();
		this.contrasenaRegistro = "";
		this.correoRegistro = "";
	}
	

	public Login(Login l) {
		super();
		this.contrasenaRegistro = l.contrasenaRegistro;
		this.correoRegistro = l.correoRegistro;
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
