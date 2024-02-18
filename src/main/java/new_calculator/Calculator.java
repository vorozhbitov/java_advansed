package new_calculator;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 */
public class Calculator {
    private double number1;
    private double number2;
    private char operator;
    private double result;

    public Calculator(double number1, double number2, char operator) throws ValueOutOfRangeException {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.result = calculate();
    }

    private double calculate() throws ValueOutOfRangeException {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return number1 / number2;
            case '^':
                double powResult = Math.pow(number1, number2);
                if (powResult > Double.MAX_VALUE) {
                    throw new ValueOutOfRangeException("Результат больше чем максимальный для типа double");
                }
                return powResult;
            default:
                throw new IllegalArgumentException("Неверный символ операции");
        }
    }

    public double getResult() {
        return result;
    }
}
