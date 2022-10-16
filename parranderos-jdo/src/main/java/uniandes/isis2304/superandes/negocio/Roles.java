package uniandes.isis2304.superandes.negocio;

public class Roles implements VORoles{
	private String rol;
	
	public Roles() 
    {
    	this.rol = "";
    }
	
	public Roles(String rol) 
    {
    	this.rol = rol;
    }
	
	public String getRol() 
	{
		return rol;
	}
	

	public void setRol(String rol) 
	{
		this.rol = rol;
	}
}

