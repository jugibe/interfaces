package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import vista.PersonaVista;

public class PersonaControlador implements ActionListener {
    private PersonaVista vista;

    public PersonaControlador(PersonaVista vista) {
        this.vista = vista;
        // Escuchar botones
        this.vista.btnAñadir.addActionListener(this);
        this.vista.btnBorrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="add") {
            vista.addPersona();
        } else if (e.getActionCommand()=="borrar") {
            vista.borrarPersona();
        }
    }

    

    
}
