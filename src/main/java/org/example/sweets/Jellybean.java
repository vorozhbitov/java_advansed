package org.example.sweets;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Задание №3_2 Сладкий подарок
 *
 * Заводим класс Jellybean, наследуемся от Sweet с общими для сладостей параметрами (название, вес, цена)
 * + дополнительный параметр Вкус (flavor)
 *
 */

public class Jellybean extends Sweet {
    private String flavor;

    public Jellybean() {}
    public Jellybean(String name, double weight, double price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String toString() {
        return "Jellybean [" + super.toString() + ", Вкус: " + flavor + "]";
    }
}
