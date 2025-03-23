import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {
  @Test
  void testUserInput() {
    // Simulate user input:
    String simulatedInput = "1.0000009\n";
    ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
    System.setIn(inputStream);

    // Capture console output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Run main method
    Task.main(new String[]{});

    double input = Double.valueOf(simulatedInput.trim());

    // Convert captured output to a string
    String output = outputStream.toString();

    // Check if the expected output is present
    assertTrue(output.contains("Enter a decimal number:"), "Invalid user prompt");
    assertTrue(output.contains("Original double: " + simulatedInput), "Invalid 1st line of the output");
    assertTrue(output.contains("Converted int: " + Double.valueOf(input).intValue()), "Invalid 2nd line of the output");
    assertTrue(output.contains("Precision was lost!"), "Invalid 3rd line of the output");
  }
}