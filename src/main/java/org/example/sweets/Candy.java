package org.example.sweets;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 *
 * Задание №3_2 Сладкий подарок
 *
 * Заводим класс Candy, наследуемся от Sweet с общими для сладостей параметрами (название, вес, цена)
 * + дополнительный параметр Вид (type)
 *
 */

public class Candy extends Sweet {
    private String type;

    public Candy() {}
    public Candy(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Candy [" + super.toString() + ", Вид: " + type + "]";
    }
}
