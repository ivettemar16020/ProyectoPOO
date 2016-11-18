/**
 * @author Grupo 5
 * @date 30/09/16
 * @file: GUI.java
 * Esto es un comentario de prueba
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.toedter.components.JSpinField;
import com.mysql.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTabbedPane;

import BaseDatos.MySQL;

public class GUI {

	JFrame frame;
	private JTextField txtNombre;
	private JTextField txtAsignatura;
	private JTextField txtDescripcion;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private Usuario miUsuario;
	private JTable tabla;
	private DefaultTableModel modelo;
	private JDateChooser elegirFecha;
	private JSlider sliderAgrado;
	private JSlider sliderDificultad;
	private JButton btnActualizar;
	
	/**
	* Launch the application.
	*/
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	GUI window = new GUI();
	window.frame.setVisible(false);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	});
	}

	/**
	* Create the application.
	*/
	public GUI() {
		initialize();
	}
	
	/**
	* Initialize the contents of the frame.
	*/
	private void initialize() {
		
	
	miUsuario = new Usuario();
	frame = new JFrame();
	frame.setBounds(200, 200, 595, 349);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 5));
	
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	frame.getContentPane().add(tabbedPane);
	
	JPanel panelDatos = new JPanel();
	tabbedPane.addTab("New tab", null, panelDatos, null);
	panelDatos.setLayout(null);
	
	JLabel lblNombre = new JLabel("Nombre");
	lblNombre.setBounds(0, 2, 191, 21);
	panelDatos.add(lblNombre);
	
	txtNombre = new JTextField();
	txtNombre.setBounds(196, 2, 191, 21);
	panelDatos.add(txtNombre);
	txtNombre.setColumns(10);
	
	btnAgregar = new JButton("Agregar");
	btnAgregar.setBounds(392, 2, 191, 21);
	panelDatos.add(btnAgregar);
	btnAgregar.addActionListener(new ButtonLisener());
	
	JLabel lblAsignatura = new JLabel("Asignatura");
	lblAsignatura.setBounds(0, 23, 191, 21);
	panelDatos.add(lblAsignatura);
	
	txtAsignatura = new JTextField();
	txtAsignatura.setBounds(196, 23, 191, 21);
	panelDatos.add(txtAsignatura);
	txtAsignatura.setColumns(10);
	
	Component horizontalStrut_2 = Box.createHorizontalStrut(20);
	horizontalStrut_2.setBounds(392, 23, 191, 21);
	panelDatos.add(horizontalStrut_2);
	
	JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
	lblDescripcin.setBounds(0, 44, 191, 21);
	panelDatos.add(lblDescripcin);
	
	txtDescripcion = new JTextField();
	txtDescripcion.setBounds(196, 44, 191, 21);
	panelDatos.add(txtDescripcion);
	txtDescripcion.setColumns(10);
	
	btnEliminar = new JButton("Eliminar");
	btnEliminar.setBounds(392, 44, 191, 21);
	panelDatos.add(btnEliminar);
	btnEliminar.addActionListener(new ButtonLisener());
	
	JLabel lblFechaDeEntrega = new JLabel("Fecha de Entrega");
	lblFechaDeEntrega.setBounds(0, 65, 191, 21);
	panelDatos.add(lblFechaDeEntrega);
	
	elegirFecha = new JDateChooser();
	elegirFecha.setBounds(196, 65, 191, 21);
	panelDatos.add(elegirFecha);
	
	Component horizontalStrut_3 = Box.createHorizontalStrut(20);
	horizontalStrut_3.setBounds(392, 65, 191, 21);
	panelDatos.add(horizontalStrut_3);
	
	JLabel lblDificultad = new JLabel("Dificultad");
	lblDificultad.setBounds(0, 86, 191, 21);
	panelDatos.add(lblDificultad);
	
	JPanel panel = new JPanel();
	panel.setBounds(196, 86, 191, 21);
	panelDatos.add(panel);
	panel.setLayout(new GridLayout(0, 3, 0, 0));
	
	JLabel lblPoco = new JLabel("Poco");
	panel.add(lblPoco);
	
	sliderDificultad = new JSlider();
	sliderDificultad.setMinimum(1);
	sliderDificultad.setValue(3);
	sliderDificultad.setMaximum(5);
	panel.add(sliderDificultad);
	
	JLabel lblMucho = new JLabel("Mucho");
	panel.add(lblMucho);
	
	Component horizontalStrut = Box.createHorizontalStrut(20);
	horizontalStrut.setBounds(392, 86, 191, 21);
	panelDatos.add(horizontalStrut);
	
	JLabel lblAgrado = new JLabel("Agrado");
	lblAgrado.setBounds(0, 107, 191, 21);
	panelDatos.add(lblAgrado);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBounds(196, 107, 191, 21);
	panelDatos.add(panel_1);
	panel_1.setLayout(new GridLayout(0, 3, 0, 0));
	
	JLabel lblPoco_1 = new JLabel("Poco");
	panel_1.add(lblPoco_1);

	sliderAgrado = new JSlider();
	sliderAgrado.setMaximum(5);
	sliderAgrado.setValue(3);
	sliderAgrado.setMinimum(1);

	panel_1.add(sliderAgrado);
	
	JLabel lblMucho_1 = new JLabel("Mucho");
	panel_1.add(lblMucho_1);
	
	JPanel panelTabla = new JPanel();
	panelTabla.setBounds(0, 139, 583, 154);
	panelDatos.add(panelTabla);
	panelTabla.setLayout(new GridLayout(0, 1, 0, 0));
	
	JScrollPane scrollPane = new JScrollPane();
	panelTabla.add(scrollPane);
	
	tabla = new JTable();
	tabla.setFillsViewportHeight(true);
	scrollPane.setViewportView(tabla);
	
	modelo = new DefaultTableModel(); 
	modelo.addColumn("Nombre");
	modelo.addColumn("Asignatura");
	modelo.addColumn("Descripcion");
	modelo.addColumn("Fecha de Entrega");
	
	
	
	btnActualizar = new JButton("Actualizar");
	btnActualizar.setBounds(438, 106, 89, 23);
	panelDatos.add(btnActualizar);
	btnActualizar.addActionListener(new ButtonLisener());
	
	
	
	JPanel panel_2 = new JPanel();
	tabbedPane.addTab("New tab", null, panel_2, null);
	
	}
	
	
	
	
	public void cargarTabla(){
		
		String sSQL="SELECT nombreTarea, descripcionTarea, asignatura, fechaE FROM tarea WHERE usuarioID='"+Pocket.idCurrentUser+"'";
		MySQL mysql = new MySQL();
		Connection cn = mysql.Conectar();
		Statement st;
		
		String[] registro = new String[4];
		
		try {
			
			modelo = new DefaultTableModel(); 
			modelo.addColumn("Nombre");
			modelo.addColumn("Asignatura");
			modelo.addColumn("Descripcion");
			modelo.addColumn("Fecha de Entrega");
			st = cn.createStatement();
			System.out.println(st);
			ResultSet rs = st.executeQuery(sSQL);
			System.out.println(rs);
			System.out.println(sSQL);
			
			while (rs.next()){
				registro[0] = rs.getString("nombreTarea");
				registro[1] = rs.getString("descripcionTarea");
				registro[2] = rs.getString("asignatura");
				registro[3] = rs.getString("fechaE");
				System.out.println(modelo);
				modelo.addRow(registro);
				tabla.setModel(modelo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	private class ButtonLisener implements  ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
		if (e.getSource() == btnAgregar){
			
			try {
				String accion = "insertar";
				MySQL mysql = new MySQL();
				Connection cn = mysql.Conectar();
				
				String nombre = txtNombre.getText();
				String descripcion = txtDescripcion.getText();
				String asignatura = txtAsignatura.getText();
				java.sql.Date sqldate = new java.sql.Date(elegirFecha.getDate().getTime());
				int gusto =  sliderAgrado.getValue();
				int dificultad = sliderDificultad.getValue();
				
				//Inserta los datos en la base de datos
				String sSQL = "INSERT INTO tarea(nombreTarea, descripcionTarea, asignatura, fechaE, gusto, dificultad, usuarioID)"
						+ "VALUES(?,?,?,?,?,?,?)";
				String mensaje = "Los datos se han insertado de manera satisfactoria";
				
				PreparedStatement pst = cn.prepareStatement(sSQL);
				pst.setString(1, nombre);
				pst.setString(2, descripcion);
				pst.setString(3, asignatura);
				pst.setDate(4, sqldate);
				pst.setInt(5, gusto);
				pst.setInt(6, dificultad);
				pst.setInt(7, Pocket.idCurrentUser);
				
				int n = pst.executeUpdate();
				
				//Vacía los textfields
				txtNombre.setText("");
				txtAsignatura.setText("");
				txtDescripcion.setText("");
				((JTextField)elegirFecha.getDateEditor().getUiComponent()).setText("");
				
				tabla.setModel(new DefaultTableModel());
				cargarTabla();
			
				if (n < 0){
					JOptionPane.showMessageDialog(null, mensaje);
				}
				
				
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	
	if (e.getSource() == btnEliminar){
	try {
	System.out.println("Funciona");	
	modelo.removeRow(tabla.getSelectedRow());//Elimna la fila selecionada por el usuario
	}
	catch (Exception e1){
	System.out.println("Error");
	}
	}
	
	if (e.getSource() == btnActualizar){
		
		try {
			
			cargarTabla();
			
		}
		catch(Exception e1){
			System.out.println(e1);
		}
	}	
	}
	}
}

