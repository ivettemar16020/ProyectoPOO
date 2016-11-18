/**
 * @author Grupo 5
 * @date 30/09/16
 *
 */
public class Usuario {
	
	private String nombre;
	private String contrasena;
	private Pocket pocket;

	public Usuario() {
		nombre = "";
		contrasena = "";
	}
	/**
	 * @param nombre
	 */
	public void setNombre(String nombre){
		this.nombre = nombre;
		}
	/**
	 * @return nombre
	 */
	public String getNombre(){
		return nombre;
		}
	/**
	 * @param contrasena
	 */
	public void setContrasena(String contrasena){
		this.contrasena = contrasena;
	}
	/**
	 * @return contrasena
	 */
	public String getContrasena(){
		return contrasena;
	}
	/**
	 * @param pocket
	 */
	public void setPocket(Pocket pocket){
		this.pocket = pocket;
	}
	/**
	 * @return pocket
	 */
	public Pocket getPocket(){
		return pocket;
	}
	
	

}

