package uniandes.isis2304.superandes.negocio;

public interface VOUsuario {
	
	public String getTipoDocumento();
			
	public long getDocumento();
		
	public String getNombre();
	
	public String getPalabraClave();
	
	public String getCorreo();
	
	public String getRol();
	
	public String getDireccion();

	@Override
	public String toString();
}
