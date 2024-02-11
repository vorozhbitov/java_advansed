package calculator.operation;

import calculator.Operation;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Вычисление степени числа 1 (степень - число 2)
 */
public class Pow extends Operation {

    public Pow(double number1, double number2) {
        super(number1, number2);
    }

    public double calculate() {

        double powResult = Math.pow(number1, number2);
        if (powResult > Double.MAX_VALUE) {
            System.out.println("Я до столько считать не умею :(");
        }
        return powResult;

    }

}
