package calculator;

import java.util.Scanner;

import static calculator.GetResult.getResult;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Здание №4_ООП
 * Реализовать калькулятор в стиле ООП
 * Вычислительные методы реализованы в отдельных классах в пакете operation. Родительский класс Operation.
 * Выбор реализации вычисления в классе GetResult
 * Стандартные операции калькулятора расширены возведением в степень и вычислением остатка от деления
 * Учтены деление на 0 и превышение максимального результата для Double при возведении в степень
 *
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите символ операции (+, -, *, /, % (остаток от деления), ^ (возведение в степень)): ");
        char operator = scanner.next().charAt(0);

        double result = getResult(operator, number1, number2);

        System.out.println("Результат: " + String.format("%.4f", result));
    }


}
