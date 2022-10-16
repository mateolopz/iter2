package uniandes.isis2304.superandes.negocio;

public class Usuario implements VOUsuario{
	private String tipoDocumento;
	private long documento;
	private String nombre;
	private String palabraClave;
	private String correo;
	private String rol;
	private String direccion;
	
	public Usuario() 
    {
    	this.tipoDocumento = "";
		this.documento = 0;
		this.nombre = "";
		this.palabraClave = "";
		this.correo = "";
		this.direccion = "";
	}

    public Usuario(String tipoDocumento, long documento, String nombre, String palabraClave, String correo, String rol, String direccion) 
    {
    	this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.nombre = nombre;
		this.palabraClave = palabraClave;
		this.correo = correo;
		this.rol = rol;
	}

	public String getTipoDocumento() 
	{
		return tipoDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento) 
	{
		this.tipoDocumento = tipoDocumento;
	}
	
	public long getDocumento() 
	{
		return documento;
	}
	
	public void setDocumento(long documento) 
	{
		this.documento = documento;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	

	public String getPalabraClave() 
	{
		return palabraClave;
	}
	
	public void setPalabraClave(String palabraClave) 
	{
		this.palabraClave = palabraClave;
	}
	
	public String getCorreo() 
	{
		return correo;
	}
	

	public void setCorreo(String correo) 
	{
		this.correo = correo;
	}
	
	public String getRol() 
	{
		return rol;
	}
	

	public void setRol(String rol) 
	{
		this.rol = rol;
	}
	
	public String getDireccion() 
	{
		return direccion;
	}
	

	public void setDireccion(String direccion) 
	{
		this.direccion = direccion;
	}
	
	@Override
	public String toString() 
	{
		return "Usuario [tipoDocumento=" + tipoDocumento + ", documento=" + documento + ", nombre=" + nombre + ", palabraClave=" + palabraClave + ", correo=" 
	+ correo +", rol=" + rol +", direccion=" + direccion +"]";
	}
	

}