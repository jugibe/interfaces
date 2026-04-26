package principal;

import controlador.ControladorListaPersonas;
import vista.VistaListaPersonas;

//===== MAIN =====
public class Main {

 public static void main(String[] args) {

     VistaListaPersonas vista = new VistaListaPersonas();
     ControladorListaPersonas control = new ControladorListaPersonas(vista);
     
     vista.setVisible(true);
 }
}
