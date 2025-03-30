import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VowelCounterTest {
    @Test
    public void testCountVowels() {
        assertEquals(2, VowelCounter.countVowels("hello"));
        assertEquals(3, VowelCounter.countVowels("programming"));
        assertEquals(0, VowelCounter.countVowels("rhythm"));
        assertEquals(5, VowelCounter.countVowels("AEIOU"));
    }
}