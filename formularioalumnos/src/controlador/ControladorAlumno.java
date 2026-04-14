package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Alumno;
import vista.VistaAlumno;

public class ControladorAlumno {
    private VistaAlumno vista;
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public ControladorAlumno(VistaAlumno vista) {
        this.vista = vista;

        this.vista.addAgregarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarAlumno();
            }
        });
    }

    private void agregarAlumno() {
        try {
            String nombre = vista.getNombre();
            int edad = Integer.parseInt(vista.getEdad());
   

            Alumno alumno = new Alumno(nombre, edad);
            listaAlumnos.add(alumno);

            actualizarVista();
            vista.limpiarCampos();

        } catch (NumberFormatException e) {
            vista.mostrarMensaje("La edad debe ser un número");
        }
    }

    private void actualizarVista() {
        StringBuilder sb = new StringBuilder();
        for (Alumno a : listaAlumnos) {
            sb.append(a.toString()).append("\n");
        }
        vista.actualizarLista(sb.toString());
    }
}
