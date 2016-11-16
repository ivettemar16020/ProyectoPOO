package BaseDatos;
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