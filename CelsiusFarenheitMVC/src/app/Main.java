package app;

import Controlador.ConversorControlador;
import modelo.ConversorModelo;
import vista.ConversorVista;

public class Main {
    public static void main(String[] args) {
        ConversorModelo modelo = new ConversorModelo();
        ConversorVista vista = new ConversorVista();
        new ConversorControlador(vista, modelo);

        vista.setVisible(true);
    }
}
