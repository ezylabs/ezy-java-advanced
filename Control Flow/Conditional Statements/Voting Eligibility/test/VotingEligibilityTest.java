
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

public class VotingEligibilityTest {
  @Test
  void testEligibleToVote() {
    assertTrue(VotingEligibility.isEligibleToVote(18));
    assertTrue(VotingEligibility.isEligibleToVote(25));
  }

  @Test
  void testNotEligibleToVote() {
    assertFalse(VotingEligibility.isEligibleToVote(17));
    assertFalse(VotingEligibility.isEligibleToVote(10));
  }

  @Test
  void testMainMethod() throws Exception {
    String input = "20\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = VotingEligibility.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Enter your age: You are eligible to vote.\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }

  @Test
  void testMainMethod2() throws Exception {
    String input = "17\n";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    Method mainMethod = VotingEligibility.class.getMethod("main", String[].class);
    mainMethod.invoke(null, (Object) new String[]{});

    String expectedOutput = "Enter your age: You are not eligible to vote.\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r", ""));
  }
}