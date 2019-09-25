package Labs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //    For all operators
    private Calculator calculator;
    ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void teardown() {
        calculator = null;
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    //    Addition
    @Test
    void addition() {
        assertEquals(2, Calculator.add(1, 1));
    }

    //    Subtraction
    @Test
    void subtraction() {
        assertEquals(3, Calculator.subtract(5, 2));
    }

    //    Multiplication
    @Test
    void multiplication() {
        assertEquals(16, Calculator.multiply(8, 2));
    }

    //    Division
    @Test
    void division() {
        assertEquals(2, Calculator.divide(10, 5));
    }

//    Clear Calculator Buffer?
//    Exit Calculator Program?

    //    Handle division by zero
//    @Test
//    void divisionByZeroMessage() {
//        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
//        System.setIn(in);
//
//        Calculator.divideCase(in, "0");
//
//        System.setIn(System.in);

//        assertEquals("Error: division by zero", Calculator.divide(1, 0));
//        Exception exception = assertThrows(ArithmeticException.class, () ->

//        assertEquals("Error: division by zero", exception.getMessage());
//    }

    //    Handle unknown operator errors
//    @Test
//    void unknownOperator() {
//        //TODO: revise to become parameterized
//        assertTrue(Calculator.isUnknown('$'));
//        assertFalse(Calculator.isUnknown('+'));
//        assertFalse(Calculator.isUnknown('-'));
//        assertFalse(Calculator.isUnknown('*'));
//        assertFalse(Calculator.isUnknown('/'));
//    }
//    Handle invalid first calculation: clear buffer
//    Handle invalid first calculation: exit program
//    Handle invalid first calculation: divide by zero
//    Handle invalid first calculation: unknown operator
    @Test
    void shouldTakeUserInput() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

//        assertEquals("5", Calculator.getInput());

    }

}