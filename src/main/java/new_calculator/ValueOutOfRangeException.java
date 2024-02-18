package new_calculator;

/**
 * @author Roman Vorozhbitov
 * @version 1.0.0
 */
public class ValueOutOfRangeException extends Exception {
    public ValueOutOfRangeException(String message) {
        super(message);
    }
}
