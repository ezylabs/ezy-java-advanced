import java.util.Scanner;

public class PrintUserInput {
    public static void main(String[] args) {
        System.out.print("Hey there, type Something: ");

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read user input
        String input = scanner.nextLine();

        System.out.println("User Input is: " + input);
    }
}