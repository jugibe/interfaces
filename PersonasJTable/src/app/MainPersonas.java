package app;

import Controlador.PersonaControlador;
import vista.PersonaVista;

public class MainPersonas {
    public static void main(String[] args) {
        // En este ejemplo simple, la tabla actúa como nuestro contenedor de datos
        PersonaVista vista = new PersonaVista();
        new PersonaControlador(vista);

        vista.setVisible(true);
    }
}