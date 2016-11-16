import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearUsr extends JFrame {

	private JPanel contentPane;
	private JTextField txt_User;
	private JPasswordField passwordField;

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
		
		passwordField = new JPasswordField();
		passwordField.setBounds(213, 103, 86, 20);
		panel.add(passwordField);
		
		JButton btnCrear = new JButton("Crear");
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
