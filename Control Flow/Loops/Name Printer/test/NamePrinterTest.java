import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class NamePrinterTest {
  @Test
  void testMainMethod() throws Exception {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = NamePrinter.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Rahul\nRocky\nRambo\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}
