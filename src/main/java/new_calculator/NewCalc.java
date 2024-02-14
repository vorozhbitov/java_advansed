package new_calculator;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 */
public class NewCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setValues(15.11, 2.2353, '/');

        double result = calculator.calculate();

        System.out.printf("Результат операции: %.4f%n", result);

    }
}
