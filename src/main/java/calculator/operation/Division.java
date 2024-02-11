package calculator.operation;

import calculator.Operation;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Вычисление результата деления числа 1 на число 2
 */
public class Division extends Operation {
    public Division(double number1, double number2) {
        super(number1, number2);
    }

    public double calculate() {
        if (number2 == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return number1 / number2;
    }
}
