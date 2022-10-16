package uniandes.isis2304.superandes.negocio;

import java.sql.Timestamp;

public class Pedido implements VOPedido{
	private String estado;
	private long volumen;
	private long precio;
	private Timestamp fechaEntrega;
	private Timestamp fechaCompra;
	private long id;
	private long idProveedor;
	
	public Pedido() 
    {
    	this.estado = "";
		this.volumen = 0;
		this.precio = 0;
		this.fechaEntrega = new Timestamp (0);
		this.fechaCompra = new Timestamp (0);
		this.id = 0;
		this.idProveedor = 0;
	}

    public Pedido(String estado, long volumen, long precio, Timestamp fechaEntrega, Timestamp fechaCompra, long id, long idProveedor) 
    {
    	this.estado = estado;
		this.volumen = volumen;
		this.precio = precio;
		this.fechaEntrega = fechaEntrega;
		this.fechaCompra = fechaCompra;
		this.id = id;
		this.idProveedor = idProveedor;
	}

	public String getEstado() 
	{
		return estado;
	}
	
	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
	
	public long getVolumen() 
	{
		return volumen;
	}
	
	public void setVolumen(int volumen) 
	{
		this.volumen = volumen;
	}
	
	public long getPrecio() 
	{
		return precio;
	}
	

	public void setPrecio(int precio) 
	{
		this.precio = precio;
	}
	

	public Timestamp getFechaEntrega() 
	{
		return fechaEntrega;
	}
	
	public void setFechaEntrega(Timestamp fechaEntrega) 
	{
		this.fechaEntrega = fechaEntrega;
	}
	
	public Timestamp getFechaCompra() 
	{
		return fechaCompra;
	}
	
	public void setFechaCompra(Timestamp fechaCompra) 
	{
		this.fechaCompra = fechaCompra;
	}
	
	public long getId() 
	{
		return id;
	}
	

	public void setId(long id) 
	{
		this.id = id;
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
		return "Pedido [estado=" + estado + ", volumen=" + volumen + ", precio=" + precio + ", fechaEntrega=" + fechaEntrega + ", fechaCompra=" + fechaCompra + ", id=" + id +", idProveedor=" + idProveedor +"]";
	}
	

}
