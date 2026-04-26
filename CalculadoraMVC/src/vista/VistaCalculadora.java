package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaCalculadora extends JFrame {

    private JTextField pantalla;
    private JButton[] numeros;
    private JButton btnSuma, btnResta, btnMult, btnDiv, btnIgual, btnC;

    public VistaCalculadora() {

        setTitle("Calculadora MVC");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Pantalla
        pantalla = new JTextField();
        pantalla.setEditable(false);
        add(pantalla, BorderLayout.NORTH);

        // Panel botones
        JPanel panel = new JPanel(new GridLayout(4, 3));

        numeros = new JButton[10];

        // botones 1-9 primero
        for (int i = 1; i <= 9; i++) {
            numeros[i] = new JButton(String.valueOf(i));
            panel.add(numeros[i]);
        }

        //0 al final
        numeros[0] = new JButton("0");
        panel.add(new JLabel("")); // espacio vacío
        panel.add(numeros[0]);
        panel.add(new JLabel("")); // espacio vacío

        //Operaciones
        btnSuma = new JButton("+");
        btnResta = new JButton("-");
        btnMult = new JButton("*");
        btnDiv = new JButton("/");
        btnIgual = new JButton("=");
        btnC = new JButton("C");

        JPanel ops = new JPanel(new GridLayout(2, 3));
        ops.add(btnSuma);
        ops.add(btnResta);
        ops.add(btnMult);
        ops.add(btnDiv);
        ops.add(btnIgual);
        ops.add(btnC);

        add(panel, BorderLayout.CENTER);
        add(ops, BorderLayout.SOUTH);
    }

    // pantalla
    public void setTexto(String t) {
        pantalla.setText(t);
    }

    public String getTexto() {
        return pantalla.getText();
    }

    // listeners números
    public void addNumeroListener(int n, ActionListener l) {
        numeros[n].addActionListener(l);
    }

    // ➕ operaciones
    public void addSumaListener(ActionListener l) { btnSuma.addActionListener(l); }
    public void addRestaListener(ActionListener l) { btnResta.addActionListener(l); }
    public void addMultListener(ActionListener l) { btnMult.addActionListener(l); }
    public void addDivListener(ActionListener l) { btnDiv.addActionListener(l); }
    public void addIgualListener(ActionListener l) { btnIgual.addActionListener(l); }
    public void addClearListener(ActionListener l) { btnC.addActionListener(l); }
}