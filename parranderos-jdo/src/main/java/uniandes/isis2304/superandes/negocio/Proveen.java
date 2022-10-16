package uniandes.isis2304.superandes.negocio;

public class Proveen implements VOProveen{
	private long idProveedor;
	private long idSucursal;
	
	public Proveen() 
    {
    	this.idProveedor = 0;
		this.idSucursal = 0;
    }
	
	public Proveen(long idProveedor, long idSucursal) 
    {
    	this.idProveedor = idProveedor;
		this.idSucursal = idSucursal;
    }
	
	public long getIdProveedor() 
	{
		return idProveedor;
	}
	

	public void setIdProveedor(long idProveedor) 
	{
		this.idProveedor = idProveedor;
	}
	
	public long getIdSucursal() 
	{
		return idSucursal;
	}
	

	public void setIdSucursal(long idSucursal) 
	{
		this.idSucursal = idSucursal;
	}
}
