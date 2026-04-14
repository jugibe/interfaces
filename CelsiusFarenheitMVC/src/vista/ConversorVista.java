package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ConversorVista extends JFrame {
    public JTextField txtEntrada = new JTextField(10);
    public JComboBox<String> comboOpciones = new JComboBox<>(new String[]{"C a F", "F a C"});
    public JButton btnConvertir = new JButton("Convertir");
    public JLabel lblResultado = new JLabel("Resultado: ");

    public ConversorVista() {
        this.setTitle("Conversor de Temperatura MVC");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(new JLabel("Valor:"));
        this.add(txtEntrada);
        this.add(comboOpciones);
        this.add(btnConvertir);
        this.add(lblResultado);

        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public void addListener(ActionListener listener) {
    	btnConvertir.addActionListener(listener);
    }

	public double getValor() {
		return Double.parseDouble(txtEntrada.getText());
	}

	public String getSelección() {
		
		return (String)comboOpciones.getSelectedItem();
	}

	public void setResultado(String resultado) {
		lblResultado.setText(resultado);
		this.pack();
		
	}

	public void showError(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
		
	}
}