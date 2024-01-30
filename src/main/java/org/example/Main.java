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
 * <p>
 * Задание №2_Поиск максимального элемента в массиве:
 * <p>
 * - задаем массив слов
 * - размерность массива произвольна, задается в консоли
 * - после чего в консоли вводятся слова в количестве равном заданной длине массива
 * - в полученном массиве необходимо найти самое длинное слово
 * - результат вывести на консоль
 *
 * Программа должна выполнять одно из заданий на выбор.
 * - Если в консоли ввести 1 - запуститься выполнение калькулятора
 * - Если в консоли ввести 2 - поиск максимального слова в массиве
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 - калькулятор или 2-string array: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            calculator();
        } else if (choice == 2) {
            wordsArray();
        } else {
            System.out.println("Неверный ввод!");
        }
        scanner.close();
    }

    public static void calculator() {
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
        switch(operator) {
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
        System.out.printf("Результат: %.4f",result);
        scanner.close();
    }

    public static void wordsArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать символ новой строки после числа

        System.out.println("Введите слова в массив(по одному в строку)");

        String[] wordsArray = new String[arraySize];

        int maxLength = 0; // переменная для подсчета количества символов в словах
        String maxWord = null; // переменная для самого длинного слова

        for (int i = 0; i < arraySize; i++) {
            wordsArray[i] = scanner.nextLine();

            if (wordsArray[i].length() > maxLength) {
                maxLength = wordsArray[i].length();
                maxWord = wordsArray[i];
            }
        }

        System.out.println("Самой длинное слово в массиве: " + maxWord + ". Количество символов: " + maxLength);
        scanner.close();
    }
}