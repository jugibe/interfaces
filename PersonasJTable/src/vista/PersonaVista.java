package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class PersonaVista extends JFrame {
    public JTextField txtNombre = new JTextField(10);
    public JTextField txtEdad = new JTextField(5);
    public JButton btnAñadir = new JButton("Añadir");
    public JButton btnBorrar = new JButton("Borrar Seleccionado");
    
    // Tabla y Modelo de tabla
    public DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Edad"}, 0);
    public JTable tabla = new JTable(modeloTabla);

    public PersonaVista() {
        this.setTitle("Gestión de Personas (MVC)");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));

        // Panel Superior: Formulario
        JPanel panelForm = new JPanel();
        panelForm.add(new JLabel("Nombre:"));
        panelForm.add(txtNombre);
        panelForm.add(new JLabel("Edad:"));
        panelForm.add(txtEdad);
        panelForm.add(btnAñadir);

        // Panel Central: Tabla
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Panel Inferior: Acciones
        JPanel panelAcciones = new JPanel();
        panelAcciones.add(btnBorrar);

        this.add(panelForm, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(panelAcciones, BorderLayout.SOUTH);

        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        
        //añadir actions a los botones
        btnAñadir.setActionCommand("add");
        btnBorrar.setActionCommand("borrar");
        
    }
    
    public void addListener(ActionListener listener) {
    	btnAñadir.addActionListener(listener);
    	btnBorrar.addActionListener(listener);
    }

	public void addPersona() {
		 try {
	            String nombre = txtNombre.getText();
	            int edad = Integer.parseInt(txtEdad.getText());

	            if (nombre.isEmpty()) throw new Exception("Nombre vacío");

	            // Añadimos fila directamente al modelo de la tabla
	            modeloTabla.addRow(new Object[]{nombre, edad});
	            
	            // Limpiar campos
	            txtNombre.setText("");
	            txtEdad.setText("");
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "La edad debe ser un número.");
	        } catch (Exception ex) {
	            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
	        }
		
	}

	public void borrarPersona() {
		int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada >= 0) {
            modeloTabla.removeRow(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para borrar.");
        }
		
	}
    
}