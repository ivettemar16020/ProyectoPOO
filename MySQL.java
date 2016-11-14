/**
 * @author Grupo 5
 * @date 23/10/16
 *
 */

import java.sql. *;
import javax.swing.JOptionPane;

public class MySQL {
	
	public String db = "agenda";
	public String url = "jdbc:mysql://localhost/"+db;
	public String user = "root";
	public String pass = "";
	
	public MySQL(){
		
	}
	
	public Connection Conectar(){
		Connection link = null;
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
			link = DriverManager.getConnection(this.url, this.user, this.pass);
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return link;
	}
	
	
}




/**
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySQL {
	private static Connection Conexion;
	
	 public void MySQLConnection(String user, String pass, String db_name) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
	            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException ex) {
	            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }

	    public void closeConnection() {
	        try {
	            Conexion.close();
	            System.out.println("Se ha finalizado la conexión con el servidor");
	        } catch (SQLException ex) {
	            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }

}
*/