package modelo;

public class ModeloCalculadora {

    public double calcular(double num1, double num2, String operacion) {

        switch (operacion) {
            case "+":
                return num1 + num2;

            case "-":
                return num1 - num2;

            case "*":
                return num1 * num2;

            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("No se puede dividir entre 0");
                }
                return num1 / num2;

            default:
                throw new IllegalArgumentException("Operación no válida: " + operacion);
        }
    }
}
