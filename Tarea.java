/**
 * @author Grupo 5
 * @date 30/09/16
 *
 */
public class Tarea {

	/**
	 * 
	 */
	// Atributos
	private String nombre;
	private int fechaEntrega;
	private String descripcion;
	private int dificultad;
	private int nivelAgrado;
	
	//Constructor
	public Tarea() {
		nombre = "";
		fechaEntrega = 0;
		descripcion = "";
		dificultad = 0;
		nivelAgrado = 0;
	}
	
	//M�todos: Setters y Getters
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
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	/**
	 * @return descripcion
	 */
	public String getDescripcion(){
		return descripcion;
	}
	/**
	 * @param fechaEntrega
	 */
	public void setFechaEntrega(int fechaEntrega){
		this.fechaEntrega = fechaEntrega;
	}
	/**
	 * @return
	 */
	public int getFechaEntrega(){
		return fechaEntrega;
	}
	/**
	 * @param dificultad
	 */
	public void setDificultad(int dificultad){
		this.dificultad = dificultad;
	}
	/**
	 * @return
	 */
	public int getDificultad(){
		return dificultad;
	}
	/**
	 * @param nivelAgrado
	 */
	public void setNivelAgrado(int nivelAgrado){
		this.nivelAgrado = nivelAgrado;
	}
	/**
	 * @return
	 */
	public int getNivelAgrado(){
		return nivelAgrado;
	}
	
	//M�todo toString
	/**
	 * @param nombre
	 * @param descripcion
	 * @param fechaEntrega
	 * @return cadena
	 */
	String toString(String nombre, String descripcion, int fechaEntrega){
		String cadena = "La tarea es: " + nombre + " tiene que hacer " + descripcion + " y es para el: " + fechaEntrega;
		return cadena;
}
}
