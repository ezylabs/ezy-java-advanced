import java.util.Scanner; // Import Scanner class

public class UserInputExample {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); // Create Scanner object

      System.out.print("Enter your name: ");
      String name = scanner.nextLine(); // Read user input

      System.out.println("Hello, " + name + "! Welcome to Java.");
   }
}