import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class OddNumberPrinterTest {
  @Test
  void testMainMethod() throws Exception {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = OddNumberPrinter.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "1\n3\n5\n7\n9\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}