package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
// ===== IMPORTACIONES =====
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import modelo.ModeloListaPersonas;
import modelo.Persona;

// ===== CLASE VISTA =====
public class VistaListaPersonas extends JFrame {

	// ===== COMPONENTES =====
	private JTextField campoNombre;
	private JTextField campoEdad;
	private JButton botonAnadir;
	private JButton botonEliminar;
	private JButton botonEditar;
	private JList<Persona> lista;

	// ===== CONSTRUCTOR =====
	public VistaListaPersonas() {
		inicializar();
	}

	// ===== CONFIGURACIÓN =====
	private void inicializar() {

		setTitle("JList MVC");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// ===== PANEL SUPERIOR =====
		JPanel panel = new JPanel(new GridLayout(3, 2));

		campoNombre = new JTextField();
		campoEdad = new JTextField();
		botonAnadir = new JButton("Añadir");
		botonEliminar = new JButton("Eliminar");
		botonEditar = new JButton("Editar");

		panel.add(new JLabel("Nombre:"));
		panel.add(campoNombre);
		panel.add(new JLabel("Edad:"));
		panel.add(campoEdad);
		panel.add(botonAnadir);
		panel.add(botonEditar);

		// ===== LISTA =====
		
		lista = new JList<>();

		JScrollPane scroll = new JScrollPane(lista);

		// ===== PANEL INFERIOR =====
		JPanel panelInferior = new JPanel();
		panelInferior.add(botonEliminar);

		// ===== AÑADIR =====
		add(panel, BorderLayout.NORTH);
		add(scroll, BorderLayout.CENTER);
		add(panelInferior, BorderLayout.SOUTH);

	}

	// ===== GETTERS =====
	public String getNombre() {
		return campoNombre.getText();
	}

	public String getEdad() {
		return campoEdad.getText();
	}

	public int getIndiceSeleccionado() {
		return lista.getSelectedIndex();
	}

	// listeners	
	public void addAnadirListener(ActionListener listener) {
		botonAnadir.addActionListener(listener);
	}
	public void addEliminarListener(ActionListener listener) {
		botonEliminar.addActionListener(listener);
	}
	public void addEditarListener(ActionListener listener) {
		botonEditar.addActionListener(listener);
	}
	//modelo
	public void setModelo(DefaultListModel <Persona> modelo){
		lista.setModel(modelo);
	}
	
	
	// ===== UTILIDADES =====
	public void limpiar() {
		campoNombre.setText("");
		campoEdad.setText("");
	}

	public void mostrarError(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}
}
