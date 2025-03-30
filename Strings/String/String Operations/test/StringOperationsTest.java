import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringOperationsTest {

  @Test
  void testConcatenation() {
    assertEquals("Hello, Java! Let's learn.", StringOperations.concatenateStrings("Hello, Java!", " Let's learn."));
  }

  @Test
  void testLength() {
    assertEquals(12, StringOperations.getStringLength("Hello, Java!"));
  }

  @Test
  void testCharacterExtraction() {
    assertEquals('H', StringOperations.getFirstCharacter("Hello, Java!"));
  }

  @Test
  void testSubstring() {
    assertEquals("Java!", StringOperations.extractSubstring("Hello, Java!", 7));
  }

  @Test
  void testStringComparison() {
    assertTrue(StringOperations.compareIgnoreCase("java", "JAVA"));
  }

  @Test
  void testSearching() {
    assertTrue(StringOperations.containsSubstring("Hello, Java!", "Java"));
    assertEquals(7, StringOperations.getIndexOfSubstring("Hello, Java!", "Java"));
  }

  @Test
  void testCaseConversion() {
    assertEquals("hello, java!", StringOperations.convertToLower("Hello, Java!"));
    assertEquals("HELLO, JAVA!", StringOperations.convertToUpper("Hello, Java!"));
  }

  @Test
  void testTrimming() {
    assertEquals("Trim me", StringOperations.trimString("  Trim me  "));
  }

  @Test
  void testStringReplacement() {
    assertEquals("Hello, World!", StringOperations.replaceSubstring("Hello, Java!", "Java", "World"));
  }
}