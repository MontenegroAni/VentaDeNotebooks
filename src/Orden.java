import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden {
	private List<DetalleOrden> items;
	private int id;
	private Date creacion, envio;

	public Orden(List<DetalleOrden> items, int id, Date creacion, Date envio){
		this.items= new ArrayList<>();
		this.id= id;
		this.creacion= creacion;
		this.envio= envio;
	}

	public void agregarItem(DetalleOrden detalle){
		this.items.add(detalle);
	}

	public int getNroItems(){
		return items.size();
	}

	public void setEnvio(Date envio){
		this.envio= envio;
	}

	public float calcularTotalOrden(){
		float cantidadTotalOrden=0;
		for(DetalleOrden detO : items){
			cantidadTotalOrden+= cantidadTotalOrden + detO.getCantidad()*detO.getPrecioUnitario();
		}
		return cantidadTotalOrden;
	}
}
