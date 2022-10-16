package uniandes.isis2304.superandes.negocio;

import java.sql.Timestamp;

public interface VOFacturacion {
	
	public String getProducto();
		
	public long getCantidad();
		
	public long getPromocion();
		
	public Timestamp getFecha();
	
	public long getId();
	
	public long getIdCliente();
	
	public long getPrecio();
	
	public long getIdSucursal();

	@Override
	public String toString();

}
