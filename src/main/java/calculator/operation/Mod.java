package calculator.operation;

import calculator.Operation;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Вычисление остатка от деления числа 1 на число 2
 */
public class Mod extends Operation {
    public Mod(double number1, double number2) {
        super(number1, number2);
    }

    public double calculate() {
        return number1 % number2;
    }
}
