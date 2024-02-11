package calculator.operation;

import calculator.Operation;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Вычисление суммы чисел 1 и 2
 */
public class Addition extends Operation {
    public Addition(double number1, double number2) {
        super(number1, number2);
    }

    public double calculate() {
        return number1 + number2;
    }
}
