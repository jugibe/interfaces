package controlador;

import modelo.ModeloCalculadora;
import vista.VistaCalculadora;

public class ControladorCalculadora {

    private ModeloCalculadora modelo;
    private VistaCalculadora vista;

    private String actual = "";
    private double num1;
    private String op;

    public ControladorCalculadora(ModeloCalculadora m, VistaCalculadora v) {
        this.modelo = m;
        this.vista = v;

        // 🔢 números como botones
        for (int i = 0; i <= 9; i++) {
            final int num = i;
            vista.addNumeroListener(i, e -> escribir(num));
        }

        // ➕ operaciones
        vista.addSumaListener(e -> setOp("+"));
        vista.addRestaListener(e -> setOp("-"));
        vista.addMultListener(e -> setOp("*"));
        vista.addDivListener(e -> setOp("/"));
        vista.addIgualListener(e -> calcular());
        vista.addClearListener(e -> limpiar());
    }

    private void escribir(int n) {
        actual += n;
        vista.setTexto(actual);
    }

    private void setOp(String o) {
        if (!actual.isEmpty()) {
            num1 = Double.parseDouble(actual);
            op = o;
            actual = "";
            vista.setTexto("");
        }
    }

    private void calcular() {
        if (!actual.isEmpty()) {
            double num2 = Double.parseDouble(actual);
            double res = modelo.calcular(num1, num2, op);

            vista.setTexto(String.valueOf(res));
            actual = String.valueOf(res);
        }
    }

    private void limpiar() {
        actual = "";
        vista.setTexto("");
    }
}
