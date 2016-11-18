/**
 * @author Grupo 5
 * @date 30/09/16
 *
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	public static JTextField txt_user;
	public static JPasswordField psw_pass;
	Usuario miUsuario = new Usuario();
	final Pocket data = new Pocket();
	private GUI window2;
	final CrearUsr win3 = new CrearUsr();


	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 25));
		
		JLabel lblNewLabel = new JLabel("Usuario");
		contentPane.add(lblNewLabel);
		
		txt_user = new JTextField();
		contentPane.add(txt_user);
		txt_user.setColumns(10);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		contentPane.add(rigidArea_2);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		contentPane.add(rigidArea_3);
		
		JLabel lblNewLabel_1 = new JLabel("Constrase\u00F1a:");
		contentPane.add(lblNewLabel_1);
		
		psw_pass = new JPasswordField();
		contentPane.add(psw_pass);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		contentPane.add(rigidArea);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		contentPane.add(rigidArea_1);
		
		miUsuario.setNombre("yolo");
		miUsuario.setContrasena("yolo");
		
		JButton btn_login = new JButton("Entrar");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (data.probarPass() == 1){
					JOptionPane.showMessageDialog(null, "Bienvenido");
					window2 = new GUI();
					window2.frame.setVisible(true);
					
					
					dispose();

				}
				else {
					JOptionPane.showMessageDialog(null, "Error, usuario o contraseña incorrectas");
				}
			}
		});
		contentPane.add(btn_login);
		
		JButton btn_salir = new JButton("Salir");
		btn_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		JButton btnCrearUsuario = new JButton("Crear Usuario");
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win3.setVisible(true);
			}
		});
		contentPane.add(btnCrearUsuario);
		contentPane.add(btn_salir);
	}

}
