
public class Notebook {
	private String marca, modelo, procesador;
	private float tama�oDisco;

	public Notebook(String marca, String modelo, String procesador, float tama�oDisco){
		this.marca= marca;
		this.modelo= modelo;
		this.procesador= procesador;
		this.tama�oDisco= tama�oDisco;
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

	public float getTama�oDisco(){
		return tama�oDisco;
	}
}
