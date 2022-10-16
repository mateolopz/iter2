package uniandes.isis2304.superandes.negocio;

public class Pertenecen implements VOPertenecen{
	private long idUsuario;
	private long idSucursal;
	
	public Pertenecen() 
    {
    	this.idUsuario = 0;
		this.idSucursal = 0;
    }
	
	public Pertenecen(long idUsuario, long idSucursal) 
    {
    	this.idUsuario = idUsuario;
		this.idSucursal = idSucursal;
    }
	
	public long getIdUsuario() 
	{
		return idUsuario;
	}
	

	public void setIdUsuario(long idUsuario) 
	{
		this.idUsuario = idUsuario;
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
