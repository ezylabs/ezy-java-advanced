import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class DigitSumCalculatorTest {
  @Test
  void testMainMethod() throws Exception {
    String input = "123\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = DigitSumCalculator.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Enter a number: Sum of digits: 6\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}