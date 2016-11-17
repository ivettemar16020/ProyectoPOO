/**
 * @author Grupo 5
 * @date 30/09/16
 *
 */
import java.util.Arrays;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import BaseDatos.MySQL;

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
		
		public int probarPass(){
			
			
			
			userTemp = Ventana1.txt_user.getText();
			passTemp = Ventana1.psw_pass.getText();
			
			int resultado=0;
		    
		    String sSQL="SELECT * FROM usuario WHERE nombreUsuario='"+userTemp+"' AND contrasena='"+passTemp+"'";

		    Connection cn = null;
			
		    try {
		    	MySQL mysql = new MySQL();
		    	cn = mysql.Conectar();
				Statement st = cn.createStatement();
				ResultSet rs = st.executeQuery(sSQL);
		    	
				if(rs.next()){

		            resultado=1;

		        }
				
				
		    } catch (SQLException ex) {

		        JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

		    }finally{


		        try {

		            cn.close();

		        } catch (SQLException ex) {

		            JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

		        }

		    }

		return resultado;
		    
		    
		    
		}
		
		
	}


