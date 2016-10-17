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
	public void setNombre(String nombre){
		this.nombre = nombre;
		}
	public String getNombre(){
		return nombre;
		}
	public void setContrasena(String contrasena){
		this.contrasena = contrasena;
	}
	public String getContrasena(){
		return contrasena;
	}
	public void setPocket(Pocket pocket){
		this.pocket = pocket;
	}
	public Pocket getPocket(){
		return pocket;
	}
	
	

}

