package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConversorModelo;
import vista.ConversorVista;

public class ConversorControlador implements ActionListener {
    private ConversorVista vista;
    private ConversorModelo modelo;

    public ConversorControlador(ConversorVista vista, ConversorModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double valor = vista.getValor();
            double resultado;
            String seleccion = vista.getSelección();

            if (seleccion.equals("C a F")) {
                resultado = modelo.celsiusAFahrenheit(valor);
                vista.setResultado(String.format("Resultado: %.2f °F", resultado));
            } else {
                resultado = modelo.fahrenheitACelsius(valor);
                vista.setResultado(String.format("Resultado: %.2f °C", resultado));
            }
        } catch (NumberFormatException ex) {
        	vista.showError("Por favor ingresa un numero valido");
           
        }
    }
}