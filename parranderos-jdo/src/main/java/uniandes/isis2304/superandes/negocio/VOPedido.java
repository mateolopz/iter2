package uniandes.isis2304.superandes.negocio;

import java.sql.Timestamp;

public interface VOPedido {
	
	public String getEstado();
	
	public long getVolumen();
		
	public long getPrecio();
		
	public Timestamp getFechaEntrega();
	
	public Timestamp getFechaCompra();
	
	public long getId();
	
	public long getIdProveedor();

	@Override
	public String toString();
}
