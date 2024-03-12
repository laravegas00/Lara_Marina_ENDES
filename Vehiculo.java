package herenciaVehiculos;

public class Vehiculo {

	protected String matricula;
	protected String marca;
	protected String modelo;
		
	//Constructor sin parametros
	public Vehiculo () {
		super();
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
	}
	
	//Constructor
	public Vehiculo(String matricula, String marca, String modelo) {
		super();
		setMatricula (matricula);
		setMarca (marca);
		setModelo (modelo);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

	public String getTipo () {
		return "";
	}
	
}
