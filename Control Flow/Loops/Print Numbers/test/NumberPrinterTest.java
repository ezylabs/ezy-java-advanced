import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class NumberPrinterTest {

  @Test
  void testMainMethod() throws Exception {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = NumberPrinter.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}

