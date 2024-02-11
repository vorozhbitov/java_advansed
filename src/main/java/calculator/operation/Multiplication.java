package calculator.operation;

import calculator.Operation;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Вычисление произведения числа 1 на число 2
 */
public class Multiplication extends Operation {
    public Multiplication(double number1, double number2) {
        super(number1, number2);
    }

    public double calculate() {
        return number1 * number2;
    }
}
