package calculator;

import calculator.operation.*;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Выбор реализации вычисления в зависимости от введенного символа калькуляции
 */
public class GetResult {
    public static double getResult(char operator, double number1, double number2) {
        Operation operation = switch (operator) {
            case '+' -> new Addition(number1, number2);
            case '-' -> new Subtraction(number1, number2);
            case '*' -> new Multiplication(number1, number2);
            case '/' -> new Division(number1, number2);
            case '%' -> new Mod(number1, number2);
            case '^' -> new Pow(number1, number2);
            default -> throw new IllegalArgumentException("Неподдерживаемая операция: " + operator);
        };

        return operation.calculate();
    }
}
