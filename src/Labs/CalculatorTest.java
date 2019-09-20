package Labs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //    For all operators
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @AfterEach
    void teardown() {
        calculator = null;
    }

    //    Addition
    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }

    //    Subtraction
    @Test
    void subtraction() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    //    Multiplication
    @Test
    void multiplication() {
        assertEquals(16, calculator.multiply(8, 2));
    }

    //    Division
    @Test
    void division() {
        assertEquals(2, calculator.divide(10, 5));
    }

//    Clear Calculator Buffer?
//    Exit Calculator Program?

    //    Handle division by zero
    @Test
    void divisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.divide(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    //    Handle unknown operator errors
    @Test
    void unknownOperator() {
        //TODO: revise to become parameterized
        assertTrue(calculator.isUnknown('$'));
        assertFalse(calculator.isUnknown('+'));
        assertFalse(calculator.isUnknown('-'));
        assertFalse(calculator.isUnknown('*'));
        assertFalse(calculator.isUnknown('/'));
    }
//    Handle invalid first calculation: clear buffer
//    Handle invalid first calculation: exit program
//    Handle invalid first calculation: divide by zero
//    Handle invalid first calculation: unknown operator

}