
public class Notebook {
	private String marca, modelo, procesador;
	private float tamaņoDisco;

	public Notebook(String marca, String modelo, String procesador, float tamaņoDisco){
		this.marca= marca;
		this.modelo= modelo;
		this.procesador= procesador;
		this.tamaņoDisco= tamaņoDisco;
	}

	public String getMarca(){
		return marca;
	}

	public String getModelo(){
		return modelo;
	}

	public String getProcesador(){
		return procesador;
	}

	public float getTamaņoDisco(){
		return tamaņoDisco;
	}
}
