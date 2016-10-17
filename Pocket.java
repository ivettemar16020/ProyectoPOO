/**
 * @author Grupo 5
 * @date 30/09/16
 *
 */
import java.util.Arrays;

public class Pocket {
		
	//Atributos
	private Tarea tarea;	
	private Tarea[] arrTareas;
	/**
	 * @param tarea		
	 * @param materia
	 */
		

		
	public Pocket() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tarea
	 */
	public Tarea getTarea() {
		return tarea;
		}
	
	/**
	 * @param tarea the tarea to set
	 */
		public void setTarea(Tarea tarea) {
			this.tarea = tarea;
		}
		

	
		public int comparar(Tarea e){
			if (tarea.getFechaEntrega() < e.getFechaEntrega() && tarea.getDificultad() < e.getDificultad()){
				return -1;
			}
			if (tarea.getFechaEntrega() > e.getFechaEntrega() && tarea.getDificultad() < e.getDificultad()){
				return 1;
			}
			return 0;
		}
		static void imprimirTareas(Tarea[] array){
			for (int i = 1; i < array.length; i++){
				System.out.println((i+1) + ". " + array[1].toString());
			}
		}
		public void organizador(){
			Arrays.sort(arrTareas);
			imprimirTareas(arrTareas);
		}
		
		String userTemp = "";
		String passTemp = "";
		
		public int probarPass(String Usuario, String Pass){
			userTemp = Ventana1.txt_user.getText();
			passTemp = Ventana1.psw_pass.getText();
			if (userTemp.equals(Usuario)&& passTemp.equals(Pass)){
				return 1;
			}
			else {
			return 0;
			}
		}
		
		
	}

