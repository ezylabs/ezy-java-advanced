import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number (max 20): ");
        long num = scanner.nextLong();
        scanner.close();

        if (num < 0 || num > 20) {
            System.out.println("Invalid input! Please enter a positive number between 0 and 20.");
        } else {
            calculateFactorial(num);
        }
    }

    public static void calculateFactorial(long num) {
        long fact = 1;
        long temp = num; // Store original number for output
        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial of " + temp + " is: " + fact);
    }
}