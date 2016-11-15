/**
 * @author Grupo 5
 * @date 23/10/16
 *
 */

//TUTORIAL
//http://panamahitek.com/los-7-pasos-seguir-para-el-manejo-de-mysql-con-java/

//Importar de la libreria de MySQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
