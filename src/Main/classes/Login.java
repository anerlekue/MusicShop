package Main.classes;

public class Login {
	
	private String nombreUsuario;
	private String contrasenaLogin;
	private String correoLogin;
	
	



	public Login(String nombreUsuario, String contrasenaLogin, String correoLogin) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasenaLogin = contrasenaLogin;
		this.correoLogin = correoLogin;
	}
	

	public Login() {
		super();
		this.nombreUsuario = "";
		this.contrasenaLogin = "";
		this.correoLogin = "";
	}
	

	public Login(Login l) {
		super();
		this.nombreUsuario = l.nombreUsuario;
		this.contrasenaLogin = l.contrasenaLogin;
		this.correoLogin = l.correoLogin;
	}
	
	



	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getContrasenaLogin() {
		return contrasenaLogin;
	}


	public void setContrasenaLogin(String contrasenaLogin) {
		this.contrasenaLogin = contrasenaLogin;
	}


	public String getCorreoLogin() {
		return correoLogin;
	}


	public void setCorreoLogin(String correoLogin) {
		this.correoLogin = correoLogin;
	}

	
	

	@Override
	public String toString() {
		return "Login [nombreUsuario=" + nombreUsuario + ", contrasenaLogin=" + contrasenaLogin + ", correoLogin="
				+ correoLogin + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void LoginValidar() {
		   
	}
	public void accederTienda() {
		  
	}
}
