import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

class FactorialCalculatorTest {
  @Test
  void testValidInput() throws Exception {
    String input = "5\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = FactorialCalculator.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Enter a positive number (max 20): Factorial of 5 is: 120\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }

  @Test
  void testInvalidInput() throws Exception {
    String input = "25\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = FactorialCalculator.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Enter a positive number (max 20): Invalid input! Please enter a positive number between 0 and 20.\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}