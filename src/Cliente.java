import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private int dni;
	private List<Orden> ordenes;

	public Cliente(String nombre, int dni, List<Orden> ordenes){
		this.nombre= nombre;
		this.dni= dni;
		this.ordenes= new ArrayList<>();
	}

	public String getNombre(){
		return nombre;
	}

	public int getDni(){
		return dni;
	}

	public void addOrden(Orden o){
		this.ordenes.add(o);
	}
}
