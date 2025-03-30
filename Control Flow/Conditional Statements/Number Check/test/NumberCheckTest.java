import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class NumberCheckTest {
  @Test
  void testPositiveNumber() {
    assertEquals("5 is positive.", NumberCheck.checkNumber(5));
  }

  @Test
  void testNegativeNumber() {
    assertEquals("-3 is negative.", NumberCheck.checkNumber(-3));
  }

  @Test
  void testZero() {
    assertEquals("0 is zero.", NumberCheck.checkNumber(0));
  }

  @Test
  void testMainMethod() throws Exception {
    String input = "10\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = NumberCheck.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Enter a number: 10 is positive.\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}
