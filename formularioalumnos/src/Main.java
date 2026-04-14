import controlador.ControladorAlumno;
import vista.VistaAlumno;

public class Main {
    public static void main(String[] args) {
        VistaAlumno vista = new VistaAlumno();
        new ControladorAlumno(vista);
        vista.setVisible(true);
    }
}