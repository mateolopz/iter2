package uniandes.isis2304.superandes.negocio;

public interface VOCatalogo 
{
	public long getCodigoBarras();
	
	public String getProducto();
	
	public long getPrecio();
	
	public long getIdProveedor();

	@Override
	public String toString();

}
