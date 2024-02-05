package org.example;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 * <p>
 * Задание №3_Массивы
 * <p>
 * 1.
 * - Массив размерностью 20
 * - Он заполняется случайными целыми числами от -10 до 10
 * - Нужно найти максимальный отрицательный и минимальный положительный элементы массива
 * - Поменять их местами.
 */

public class Task2Arrays {

    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        // Вывод созданного массива
        System.out.println("Массив создан");
        System.out.println(Arrays.toString(array));

        // Нахождение максимального отрицательного элемента и его индекса
        int maxNegative = Integer.MIN_VALUE; // -2147483648
        int maxNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] > maxNegative) {
                maxNegative = array[i];
                maxNegativeIndex = i;
            }
        }

        // Нахождение минимального положительного элемента и его индекса
        int minPositive = Integer.MAX_VALUE; // 2147483647
        int minPositiveIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < minPositive) {
                minPositive = array[i];
                minPositiveIndex = i;
            }
        }

        // Поменять местами максимальный отрицательный и минимальный положительный элементы
        if (maxNegativeIndex != -1 && minPositiveIndex != -1) {
            int temp = array[maxNegativeIndex];
            array[maxNegativeIndex] = array[minPositiveIndex];
            array[minPositiveIndex] = temp;
        }

        // Вывод массива после замены элементов
        System.out.println("Массив после замены элементов");
        System.out.println(Arrays.toString(array));

        System.out.println("Максимальный отрицательный элемент: " + maxNegative);
        System.out.println("Минимальный положительный элемент: " + minPositive);

    }

}
