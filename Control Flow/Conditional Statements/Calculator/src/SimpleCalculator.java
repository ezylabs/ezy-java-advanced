import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        sc.close();

        double result = calculate(num1, num2, operator);
        if (Double.isNaN(result)) {
            System.out.println("Error! Division by zero or invalid operator.");
        } else {
            System.out.println("Result: " + result);
        }
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (num2 != 0) ? num1 / num2 : Double.NaN;
            default:
                return Double.NaN;
        }
    }
}