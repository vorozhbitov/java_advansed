package org.example.sweets;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Задание №3_2 Сладкий подарок
 *
 * Заводим абстрактный класс Sweet с общими для сладостей параметрами (название, вес, цена)
 *
 */

public abstract class Sweet {
    private String name;
    private double weight;
    private double price;

    public Sweet() {}

    public Sweet(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Название: " + name + ", Вес: " + weight + "г, Цена: " + price + "руб.";
    }
}
