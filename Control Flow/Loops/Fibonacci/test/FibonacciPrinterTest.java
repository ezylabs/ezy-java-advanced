import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class FibonacciPrinterTest {
  @Test
  void testMainMethod() throws Exception {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = FibonacciPrinter.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "0\n1\n1\n2\n3\n5\n8\n13\n21\n34\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}