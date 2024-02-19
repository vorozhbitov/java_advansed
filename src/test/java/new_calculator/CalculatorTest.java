package new_calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void getResultFromDifferentOperatorTest() throws ValueOutOfRangeException {
        double num1 = 2.00;
        double num2 = 2.00;
        char[] operators = {'+', '-', '*', '/', '^'};
        double[] expected = {4, 0, 4, 1, 4};
        double[] actual = new double[5];

        for (int i = 0; i < operators.length; i++) {
            char op = operators[i];
            Calculator calculator = new Calculator(num1, num2, op);
            actual[i] = calculator.getResult();
        }

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i], 0);
        }

    }

}
