package uniandes.isis2304.superandes.negocio;

public class ProductosEnPedido implements VOProductosEnPedido{
	private long idProducto;
	private long idPedido;
	
	public ProductosEnPedido() 
    {
    	this.idProducto = 0;
		this.idPedido = 0;
    }
	
	public ProductosEnPedido(long idProducto, long idPedido) 
    {
    	this.idProducto = idProducto;
		this.idPedido = idPedido;
    }
	
	public long getIdProducto() 
	{
		return idProducto;
	}
	

	public void setIdProducto(long idProducto) 
	{
		this.idProducto = idProducto;
	}
	
	public long getIdPedido() 
	{
		return idPedido;
	}
	

	public void setIdPedido(long idPedido) 
	{
		this.idPedido = idPedido;
	}
}
