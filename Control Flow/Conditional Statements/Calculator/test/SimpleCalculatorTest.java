import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleCalculatorTest {
    @Test
    void testAddition() {
        assertEquals(5.0, SimpleCalculator.calculate(2, 3, '+'));
    }

    @Test
    void testSubtraction() {
        assertEquals(1.0, SimpleCalculator.calculate(3, 2, '-'));
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, SimpleCalculator.calculate(2, 3, '*'));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, SimpleCalculator.calculate(6, 3, '/'));
    }

    @Test
    void testDivisionByZero() {
        assertTrue(Double.isNaN(SimpleCalculator.calculate(6, 0, '/')));
    }

    @Test
    void testInvalidOperator() {
        assertTrue(Double.isNaN(SimpleCalculator.calculate(6, 3, 'x')));
    }

    @Test
    void testMainMethod() throws Exception {
        String input = "10\n+\n5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Method mainMethod = SimpleCalculator.class.getMethod("main", String[].class);
        mainMethod.invoke(null, (Object) new String[]{});

        String expectedOutput = "Enter first number: Enter an operator (+, -, *, /): Enter second number: Result: 15.0\n";
        assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
    }
}
