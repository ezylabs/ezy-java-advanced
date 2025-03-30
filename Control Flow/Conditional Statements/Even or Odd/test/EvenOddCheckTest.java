import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class EvenOddCheckTest {
  @Test
  void testEvenNumber() {
    assertEquals("4 is even.", EvenOddCheck.checkEvenOdd(4));
  }

  @Test
  void testOddNumber() {
    assertEquals("7 is odd.", EvenOddCheck.checkEvenOdd(7));
  }

  @Test
  void testZero() {
    assertEquals("0 is even.", EvenOddCheck.checkEvenOdd(0));
  }

  @Test
  void testMainMethod() throws Exception {
    String input = "10\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = EvenOddCheck.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Enter a number: 10 is even.\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}
