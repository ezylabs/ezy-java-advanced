import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class EvenNumberPrinterTest {
  @Test
  void testMainMethod() throws Exception {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = EvenNumberPrinter.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "2\n4\n6\n8\n10\n12\n14\n16\n18\n20\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}
