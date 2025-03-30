import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearCheckerTest {

  private String runMainWithInput(String input) throws Exception {
    // Set up input stream to simulate user input
    InputStream stdin = System.in;
    System.setIn(new ByteArrayInputStream(input.getBytes()));

    // Capture output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    try {
      // Use reflection to invoke the main method
      Method mainMethod = LeapYearChecker.class.getMethod("main", String[].class);
      mainMethod.invoke(null, (Object) new String[]{});

      // Return the captured output as a string
      return outputStream.toString().trim();
    } finally {
      // Restore original streams
      System.setIn(stdin);
      System.setOut(originalOut);
    }
  }

  @Test
  void testMainWithLeapYear() throws Exception {
    String output = runMainWithInput("2024\n");
    assertTrue(output.contains("2024 is a leap year."));
  }

  @Test
  void testMainWithNonLeapYear() throws Exception {
    String output = runMainWithInput("2023\n");
    assertTrue(output.contains("2023 is not a leap year."));
  }

  @Test
  void testMainWithCenturyYearNotLeap() throws Exception {
    String output = runMainWithInput("1900\n");
    assertTrue(output.contains("1900 is not a leap year."));
  }

  @Test
  void testMainWithCenturyLeapYear() throws Exception {
    String output = runMainWithInput("2000\n");
    assertTrue(output.contains("2000 is a leap year."));
  }

  @Test
  void testLeapYearDivisibleBy4ButNot100() {
    assertTrue(LeapYearChecker.isLeapYear(2024)); // 2024 is a leap year
  }

  @Test
  void testLeapYearDivisibleBy400() {
    assertTrue(LeapYearChecker.isLeapYear(2000)); // 2000 is a leap year
  }

  @Test
  void testNonLeapYearDivisibleBy100ButNot400() {
    assertFalse(LeapYearChecker.isLeapYear(1900)); // 1900 is not a leap year
  }

  @Test
  void testNonLeapYearNotDivisibleBy4() {
    assertFalse(LeapYearChecker.isLeapYear(2023)); // 2023 is not a leap year
  }
}