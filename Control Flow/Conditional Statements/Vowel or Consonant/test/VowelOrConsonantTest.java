import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;

public class VowelOrConsonantTest {
  @Test
  void testVowelLowercase() {
    assertEquals("a is a vowel.", VowelOrConsonant.checkVowelOrConsonant('a'));
  }

  @Test
  void testVowelUppercase() {
    assertEquals("E is a vowel.", VowelOrConsonant.checkVowelOrConsonant('E'));
  }

  @Test
  void testConsonantLowercase() {
    assertEquals("b is a consonant.", VowelOrConsonant.checkVowelOrConsonant('b'));
  }

  @Test
  void testConsonantUppercase() {
    assertEquals("Z is a consonant.", VowelOrConsonant.checkVowelOrConsonant('Z'));
  }

  @Test
  void testMainMethod() throws Exception {
    String input = "O\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = VowelOrConsonant.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Enter a character: O is a vowel.\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}
