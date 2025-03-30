import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
  @Test
  public void testRemoveDuplicates() {
    assertEquals("ban", RemoveDuplicates.removeDuplicates("banana"));
    assertEquals("abc", RemoveDuplicates.removeDuplicates("abcabc"));
    assertEquals("", RemoveDuplicates.removeDuplicates(""));
    assertEquals("a", RemoveDuplicates.removeDuplicates("aaaa"));
  }
}