package Main;

import controlador.ControladorCalculadora;
import modelo.ModeloCalculadora;
import vista.VistaCalculadora;

public class Main {
    public static void main(String[] args) {

     
        ModeloCalculadora modelo = new ModeloCalculadora();

       
        VistaCalculadora vista = new VistaCalculadora();

    
        new ControladorCalculadora(modelo, vista);

    
        vista.setVisible(true);
    }
}
