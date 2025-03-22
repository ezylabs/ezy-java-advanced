import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {
  @Test
  void testUserInput() {
    // Simulate user input: "Hello World"
    String simulatedInput = "Hello World\n";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
    System.setIn(inputStream);

    // Capture console output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Run main method
    PrintUserInput.main(new String[]{});

    // Convert captured output to a string
    String output = outputStream.toString();

    // Check if the expected output is present
    assertTrue(output.contains("Hey there, type Something: "));
    assertTrue(output.contains("User Input is: " + simulatedInput));
  }
}