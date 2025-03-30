import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VowelConsonantCounterTest {
  @Test
  public void testCountVowelsAndConsonants() {
    assertArrayEquals(new int[]{3, 7}, VowelConsonantCounter.countVowelsAndConsonants("hello world"));
    assertArrayEquals(new int[]{0, 0}, VowelConsonantCounter.countVowelsAndConsonants(""));
    assertArrayEquals(new int[]{1, 0}, VowelConsonantCounter.countVowelsAndConsonants("a"));
    assertArrayEquals(new int[]{3, 3}, VowelConsonantCounter.countVowelsAndConsonants("banana"));
  }
}