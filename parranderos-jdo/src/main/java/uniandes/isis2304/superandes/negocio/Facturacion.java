package uniandes.isis2304.superandes.negocio;

import java.sql.Timestamp;

public class Facturacion implements VOFacturacion{
	private String producto;
	private long cantidad;
	private long promocion;
	private Timestamp fecha;
	private long precio;
	private long id;
	private long idCliente;
	private long idSucursal;
	
	public Facturacion() 
    {
    	this.producto = "";
		this.cantidad = 0;
		this.promocion = 0;
		this.fecha = new Timestamp (0);
		this.precio = 0;
		this.id = 0;
		this.idCliente = 0;
		this.idSucursal = 0;
	}

    public Facturacion(String producto, long cantidad, long promocion, Timestamp fecha, long precio, long id, long idCliente, long idSucursal) 
    {
    	this.producto = producto;
		this.cantidad = cantidad;
		this.promocion = promocion;
		this.fecha = fecha;
		this.precio = precio;
		this.id = id;
		this.idCliente = idCliente;
		this.idSucursal = idSucursal;
	}

	public String getProducto() 
	{
		return producto;
	}
	
	public void setProducto(String producto) 
	{
		this.producto = producto;
	}
	
	public long getCantidad() 
	{
		return cantidad;
	}
	
	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}
	
	public long getPromocion() 
	{
		return promocion;
	}
	

	public void setPromocion(int promocion) 
	{
		this.promocion = promocion;
	}
	

	public Timestamp getFecha() 
	{
		return fecha;
	}
	
	public void setFecha(Timestamp fecha) 
	{
		this.fecha = fecha;
	}
	
	public long getPrecio() 
	{
		return precio;
	}
	

	public void setPrecio(long precio) 
	{
		this.precio = precio;
	}
	
	public long getId() 
	{
		return id;
	}
	

	public void setId(long id) 
	{
		this.id = id;
	}
	
	public long getIdCliente() 
	{
		return idCliente;
	}
	

	public void setIdCliente(long idCliente) 
	{
		this.idCliente = idCliente;
	}
	
	public long getIdSucursal() 
	{
		return idSucursal;
	}
	

	public void setIdSucursal(long idSucursal) 
	{
		this.idSucursal = idSucursal;
	}
	
	@Override
	public String toString() 
	{
		return "Facturacion [producto=" + producto + ", cantidad=" + cantidad + ", promocion=" + promocion + ", fecha=" + fecha + ", precio=" + precio + ", id=" + id +", idCliente=" + idCliente +
				", idSucursal=" + idSucursal +"]";
	}
	

}
