package new_calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test(expected = ArithmeticException.class)
    public void testArithmeticException() throws ValueOutOfRangeException {
        Calculator calc1 = new Calculator(5, 0, '/');
        calc1.calculate();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() throws ValueOutOfRangeException {
        Calculator calc2 = new Calculator(5, 3, '&');
        calc2.calculate();
    }
    @Test(expected = ValueOutOfRangeException.class)
    public void testValueOutOfRangeException() throws ValueOutOfRangeException {
        Calculator calc3 = new Calculator(Double.MAX_VALUE, 2, '^');
        calc3.calculate();
    }

    @Test
    public void getResultFromDifferentOperatorTest() {
        double num1 = 2.00;
        double num2 = 2.00;
        char[] operators = {'+', '-', '*', '/', '^'};
        double[] expected = {4, 0, 4, 1, 4};
        double[] actual = new double[5];

        for (int i = 0; i < operators.length; i++) {
            char op = operators[i];
            Calculator calc1 = new Calculator(num1, num2, op);
            actual[i] = calc1.getResult();
        }

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i], 0);
        }

    }
}
