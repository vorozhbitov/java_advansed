package org.example;

import java.util.Scanner;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 * <p>
 * Задание №1_Калькулятор
 * <p>
 * - Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 * - Использовать комментарии и JavaDoc при описании метода.
 * - Использовать форматирование при выводе результата в консоль.
 * Полученный результат округлять до 4-х знаков после запятой.
 * Запушить проект в свой репозиторий на GitHub и прикрепить ссылку на него в ответе на задание
 * Доп задание по желание: добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 */

public class Main {
    public static void main(String[] args) {

        // Ввод двух чисел и оператора для калькуляции
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        /*  Вычисление результата в зависимости от введененного результата
         *  + Проверка деления на 0
         *  + Проверка на корректность введенного оператора
         */

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор.");
                return;
        }

        // Вывод результата с округлением до 4х знаков после запятой
        System.out.printf("Результат: %.4f", result);
        scanner.close();
    }
}