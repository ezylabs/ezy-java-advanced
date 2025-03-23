import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");

        // Define Scanner
        Scanner scanner = new Scanner(System.in);

        // Read input and save as double
        double num = scanner.nextDouble();

        // Typecast to int
        int converted = (int) num;

        System.out.println("Original double: " + num);
        System.out.println("Converted int: " + converted);
        System.out.println("Precision was lost!");
    }
}