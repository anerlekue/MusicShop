package Main.classes;

public class Altavoz {
	
	private String modelo;
	private int numeroSerie;
	private int precio;
	
	
	
	
	

	public Altavoz(String modelo, int numeroSerie, int precio) {
		super();
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.precio = precio;
	}


	public Altavoz() {
		super();
		this.modelo = "";
		this.numeroSerie = 0;
		this.precio = 0;
	}

	

	public Altavoz(Altavoz a) {
		super();
		this.modelo = a.modelo;
		this.numeroSerie = a.numeroSerie;
		this.precio = a.precio;
	}



	



	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getNumeroSerie() {
		return numeroSerie;
	}


	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Altavoz [modelo=" + modelo + ", numeroSerie=" + numeroSerie + ", precio=" + precio + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
