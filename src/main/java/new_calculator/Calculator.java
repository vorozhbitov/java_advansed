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

    public Calculator(double number1, double number2, char operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        try {
            this.result = calculate();
        } catch (ArithmeticException | IllegalArgumentException | ValueOutOfRangeException e) {
            this.result = 0.0;
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public double calculate() throws ValueOutOfRangeException {
        double calcResult = 0.0;
        switch (operator) {
            case '+':
                calcResult = number1 + number2;
                break;
            case '-':
                calcResult = number1 - number2;
                break;
            case '*':
                calcResult = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    throw new ArithmeticException("Деление на 0 недопустимо");
                }
                calcResult = number1 / number2;
                break;
            case '^':
                calcResult = Math.pow(number1, number2);
                if (calcResult > Double.MAX_VALUE) {
                    throw new ValueOutOfRangeException("Результат больше чем максимальный для типа double");
                }
                break;
            default:
                throw new IllegalArgumentException("Неверный оператор");
        }
        return calcResult;
    }

    public double getResult() {
        return result;
    }

}
