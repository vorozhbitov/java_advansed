package new_calculator;

import java.util.Scanner;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Здание №4_ООП
 * Задание №6_Обработка исключений
 * Реализовать калькулятор в стиле ООП
 * Добавить обработку исключений в задание с ООП калькулятора
 */
public class NewCalc {
    public static void main(String[] args) throws ValueOutOfRangeException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /, ^):");
        char op = scanner.next().charAt(0);

        Calculator calculator = new Calculator(num1, num2, op);

        System.out.printf("Результат операции: %.4f%n", calculator.getResult());

        scanner.close();

    }
}
