package classes;

public class Instrumento {
	
	private String tipo;
	private String modelo;
	private int precio;
	
	
	

	public Instrumento(String tipo, String modelo, int precio) {
		super();
		this.tipo = tipo;
		this.modelo = modelo;
		this.precio = precio;
	}
	

	public Instrumento() {
		super();
		this.tipo = "";
		this.modelo = "";
		this.precio = 0;
	}


	public Instrumento(Instrumento i) {
		super();
		this.tipo = i.tipo;
		this.modelo = i.modelo;
		this.precio = i.precio;
	}

	
	

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	
	@Override
	public String toString() {
		return "Instrumento [tipo=" + tipo + ", modelo=" + modelo + ", precio=" + precio + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}