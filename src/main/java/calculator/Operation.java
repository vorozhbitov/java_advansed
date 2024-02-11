package calculator;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 */
public abstract class Operation {
    protected double number1;
    protected double number2;

    public Operation(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public abstract double calculate();
}