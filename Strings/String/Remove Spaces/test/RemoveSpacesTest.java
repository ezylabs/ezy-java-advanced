import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveSpacesTest {
  @Test
  public void testRemoveSpaces() {
    assertEquals("HelloWorld", RemoveSpaces.removeSpaces("Hello World"));
    assertEquals("JavaProgramming", RemoveSpaces.removeSpaces("Java Programming"));
    assertEquals("", RemoveSpaces.removeSpaces("     "));
  }
}