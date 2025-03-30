import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class LargestNumberTest {
  @Test
  void testLargestFirstNumber() {
    assertEquals(30, LargestNumber.findLargest(30, 20, 10));
  }

  @Test
  void testLargestSecondNumber() {
    assertEquals(50, LargestNumber.findLargest(10, 50, 30));
  }

  @Test
  void testLargestThirdNumber() {
    assertEquals(40, LargestNumber.findLargest(20, 30, 40));
  }

  @Test
  void testAllEqualNumbers() {
    assertEquals(25, LargestNumber.findLargest(25, 25, 25));
  }

  @Test
  void testMainMethod() throws Exception {
    String input = "5\n15\n10\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = LargestNumber.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Enter three numbers: Largest number is: 15\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}
