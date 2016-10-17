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
	
	//Métodos: Setters y Getters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	public String getDescripcion(){
		return descripcion;
	}
	public void setFechaEntrega(int fechaEntrega){
		this.fechaEntrega = fechaEntrega;
	}
	public int getFechaEntrega(){
		return fechaEntrega;
	}
	public void setDificultad(int dificultad){
		this.dificultad = dificultad;
	}
	public int getDificultad(){
		return dificultad;
	}
	public void setNivelAgrado(int nivelAgrado){
		this.nivelAgrado = nivelAgrado;
	}
	public int getNivelAgrado(){
		return nivelAgrado;
	}
	
	//Método toString
	String toString(String nombre, String descripcion, int fechaEntrega){
		String cadena = "La tarea es: " + nombre + " tiene que hacer " + descripcion + " y es para el: " + fechaEntrega;
		return cadena;
}
}
