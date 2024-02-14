package new_calculator;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 */
public class Calculator {
    private double number1;
    private double number2;
    private char operation;

    public void setValues(double number1, double number2, char operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public double calculate() {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> {
                if (number2 == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                yield number1 / number2;
            }
            default -> throw new IllegalArgumentException("Неверный символ операции");
        };
    }
}
