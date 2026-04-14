package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VistaAlumno extends JFrame{

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	private JTextField txtNombre = new JTextField(15);
    private JTextField txtEdad = new JTextField(5);
    private JButton btnAgregar = new JButton("Agregar");
    private JTextArea areaAlumnos=new JTextArea(10,30);
	
    public VistaAlumno() {
    	setTitle("Formulario Alumnos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Nombre:"));
        add(txtNombre);

        add(new JLabel("Edad:"));
        add(txtEdad);

 

        add(btnAgregar);

        areaAlumnos.setEditable(false);
        add(new JScrollPane(areaAlumnos));

        pack();
        setLocationRelativeTo(null);

	}
    
 // Getters
    public String getNombre() { return txtNombre.getText(); }
    public String getEdad() { return txtEdad.getText(); }


    public void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void actualizarLista(String texto) {
        areaAlumnos.setText(texto);
    }

    public void addAgregarListener(ActionListener listener) {
        btnAgregar.addActionListener(listener);
    }

}
