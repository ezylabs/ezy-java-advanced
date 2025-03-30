import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringReversalTest {
  @Test
  public void testReverseString() {
    assertEquals("olleh", StringReversal.reverseString("hello"));
    assertEquals("", StringReversal.reverseString(""));
    assertEquals("a", StringReversal.reverseString("a"));
    assertEquals("987654321", StringReversal.reverseString("123456789"));
  }

  @Test
  public void testReverseStringSimple() {
    assertEquals("olleh", StringReversal.reverseStringSimple("hello"));
    assertEquals("", StringReversal.reverseStringSimple(""));
    assertEquals("a", StringReversal.reverseStringSimple("a"));
    assertEquals("987654321", StringReversal.reverseStringSimple("123456789"));
  }
}