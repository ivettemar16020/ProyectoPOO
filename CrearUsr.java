import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BaseDatos.MySQL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class CrearUsr extends JFrame {

	private JPanel contentPane;
	private JTextField txt_User;
	private JPasswordField pss_Pss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearUsr frame = new CrearUsr();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CrearUsr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(60, 71, 87, 14);
		panel.add(lblUsuario);
		
		JLabel lblCrearUsuario = new JLabel("Crear Usuario");
		lblCrearUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCrearUsuario.setBounds(153, 11, 96, 24);
		panel.add(lblCrearUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(60, 106, 87, 14);
		panel.add(lblContrasea);
		
		txt_User = new JTextField();
		txt_User.setBounds(213, 68, 86, 20);
		panel.add(txt_User);
		txt_User.setColumns(10);
		
		pss_Pss = new JPasswordField();
		pss_Pss.setBounds(213, 103, 86, 20);
		panel.add(pss_Pss);
		
		MySQL mysql = new MySQL();
		Connection cn = mysql.Conectar();
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnCrear){
					
					try {
						String accion = "insertar";
						MySQL mysql = new MySQL();
						Connection cn = mysql.Conectar();
						
						String user = txt_User.getText();
						String pass = pss_Pss.getText();
						
						
						//Inserta los datos en la base de datos
						String sSQL = "INSERT INTO usuario(nombreUsuario, contrasena)"
								+ "VALUES(?,?)";
						String mensaje = "Los datos se han insertado de manera satisfactoria";
						
						PreparedStatement pst = cn.prepareStatement(sSQL);
						pst.setString(1, user);
						pst.setString(2, pass);
						
						
						int n = pst.executeUpdate();
						
						//Vacía los textfields
						txt_User.setText("");
						pss_Pss.setText("");
						
						
						if (n < 0){
							JOptionPane.showMessageDialog(null, mensaje);
						}
						
						
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
			}
		});
		btnCrear.setBounds(85, 158, 89, 23);
		panel.add(btnCrear);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(210, 158, 89, 23);
		panel.add(btnSalir);
	}
}
