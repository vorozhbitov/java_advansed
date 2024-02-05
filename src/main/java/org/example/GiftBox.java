package org.example;

import org.example.sweets.Candy;
import org.example.sweets.Jellybean;
import org.example.sweets.Sweet;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 * <p>
 * Задание №3_Массивы
 * <p>
 * 2. Формируется сладкий подарок.
 * - Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * - У каждой сладости есть название, вес, цена и свой уникальный параметр
 * - Необходимо собрать подарок из сладостей
 * - Найти общий вес подарка, общую стоимость подарка
 * - Вывести на консоль информацию о всех сладостях в подарке
 */

public class GiftBox {
    public static void main(String[] args) {

        // Заполняем подарок предварительно созданными сладостями

        Candy candy1 = new Candy("Шоколад Алёнка", 90, 83.00, "Молочный шоколад");
        Candy candy2 = new Candy("Бабаевский элитный", 90, 109.00, "Горький шоколад");
        Jellybean jellybean1 = new Jellybean("Мармелад Mamba", 140, 576.00, "Ассорти фруктов");
        Jellybean jellybean2 = new Jellybean("Мармелад HARIBO", 175, 406.00, "Ягоды");

        Sweet[] giftBox = {candy1, candy2, jellybean1, jellybean2};

        double totalWeight = 0;
        double totalPrice = 0;

        System.out.println("Состав подарка:");

        // Считаем вес и цену подарка, заодно выводим его состав
        for (Sweet sweet : giftBox) {
            totalWeight += sweet.getWeight();
            totalPrice += sweet.getPrice();

            System.out.println(sweet);
        }

        System.out.println("Общий вес подарка: " + totalWeight + " грамм");
        System.out.printf("Общая стоимость подарка: %.2f рублей", totalPrice);


    }
}


