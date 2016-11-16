/**
 * @author Grupo 5
 * @date 30/09/16
 * @file: GUI.java
 * Esto es un comentario de prueba
 * Que divertido
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
import com.toedter.calendar.JDateChooser;
import javax.swing.JTabbedPane;

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
	frame.setBounds(200, 200, 604, 360);
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
	int value = sliderAgrado.getValue();
	int min = sliderAgrado.getMinimum();
	int max = sliderAgrado.getMaximum();
	panel_1.add(sliderAgrado);
	
	JLabel lblMucho_1 = new JLabel("Mucho");
	panel_1.add(lblMucho_1);
	
	Component horizontalStrut_1 = Box.createHorizontalStrut(20);
	horizontalStrut_1.setBounds(392, 107, 191, 21);
	panelDatos.add(horizontalStrut_1);
	
	JPanel panelTabla = new JPanel();
	panelTabla.setBounds(0, 139, 583, 154);
	panelDatos.add(panelTabla);
	panelTabla.setLayout(new GridLayout(0, 1, 0, 0));
	
	JScrollPane scrollPane = new JScrollPane();
	panelTabla.add(scrollPane);
	
	modelo = new DefaultTableModel(); 
	modelo.addColumn("Nombre");
	modelo.addColumn("Asignatura");
	modelo.addColumn("Descripcion");
	modelo.addColumn("Fecha de Entrega");
	
	tabla = new JTable();
	tabla.setFillsViewportHeight(true);
	scrollPane.setViewportView(tabla);
	tabla.setModel(modelo);
	
	JPanel panel_2 = new JPanel();
	tabbedPane.addTab("New tab", null, panel_2, null);
	
	
	
	}
	
	private class ButtonLisener implements  ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource() == btnAgregar){
	try {
	String nombre = "";
	String asignatura = "";
	String[] colum = new String[5];
	colum[0] = txtNombre.getText();
	colum[1] = txtAsignatura.getText();
	colum[2] = txtDescripcion.getText();
	colum[3] = ((JTextField)elegirFecha.getDateEditor().getUiComponent()).getText();
	modelo.addRow(colum);
	tabla.setModel(modelo);
	txtNombre.setText("");
	txtAsignatura.setText("");
	txtDescripcion.setText("");
	((JTextField)elegirFecha.getDateEditor().getUiComponent()).setText("");
	
	
	TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabla.getModel());
	tabla.setRowSorter(sorter);
	List<RowSorter.SortKey> sortKeys = new ArrayList<>();
	 
	int columnIndexToSort = 3;
	sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
	 
	sorter.setSortKeys(sortKeys);
	sorter.sort();
	
	System.out.println("Funciona");	
	}
	catch (Exception e1){
	System.out.println("Error");
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
	}	
	}
	
	
	private static void addPopup(Component component, final JPopupMenu popup) {
	component.addMouseListener(new MouseAdapter() {
	public void mousePressed(MouseEvent e) {
	if (e.isPopupTrigger()) {
	showMenu(e);
	}
	}
	public void mouseReleased(MouseEvent e) {
	if (e.isPopupTrigger()) {
	showMenu(e);
	}
	}
	private void showMenu(MouseEvent e) {
	popup.show(e.getComponent(), e.getX(), e.getY());
	}
	});
	}
	
	public void stateChanged(ChangeEvent e){
		JSlider source = (JSlider)e.getSource();
	}
}