import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
  @Test
  public void testIsPalindrome() {
    assertTrue(PalindromeChecker.isPalindrome("racecar"));
    assertFalse(PalindromeChecker.isPalindrome("hello"));
    assertTrue(PalindromeChecker.isPalindrome("madam"));
    assertTrue(PalindromeChecker.isPalindrome("a"));
    assertTrue(PalindromeChecker.isPalindrome(""));
  }
}