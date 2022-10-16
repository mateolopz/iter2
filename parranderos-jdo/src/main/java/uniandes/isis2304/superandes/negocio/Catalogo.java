package uniandes.isis2304.superandes.negocio;

public class Catalogo implements VOCatalogo{
	private long codigoBarras;
	private String producto;
	private long precio;
	private long idProveedor;
	
	public Catalogo() 
    {
    	this.codigoBarras = 0;
		this.producto = "";
		this.precio = 0;
		this.idProveedor = 0;
	}

    public Catalogo(long codigoBarras, String producto, long precio, long idProveedor) 
    {
    	this.codigoBarras = codigoBarras;
		this.producto = producto;
		this.precio = precio;
		this.idProveedor = idProveedor;
	}

	public long getCodigoBarras() 
	{
		return codigoBarras;
	}
	
	public void setCodigoBarras(long codigoBarras) 
	{
		this.codigoBarras = codigoBarras;
	}
	
	public String getProducto() 
	{
		return producto;
	}
	
	public void setProducto(String producto) 
	{
		this.producto = producto;
	}
	
	public long getPrecio() 
	{
		return precio;
	}
	

	public void setPrecio(int precio) 
	{
		this.precio = precio;
	}
	

	public long getIdProveedor() 
	{
		return idProveedor;
	}
	
	public void setIdProveedor(long idProveedor) 
	{
		this.idProveedor = idProveedor;
	}
	
	@Override
	public String toString() 
	{
		return "Catalogo [codigoBarras=" + codigoBarras + ", producto=" + producto + ", precio=" + precio + ", idProveedor=" + idProveedor + "]";
	}
	

}
