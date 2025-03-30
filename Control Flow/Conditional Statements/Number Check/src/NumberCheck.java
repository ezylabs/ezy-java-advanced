import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println(checkNumber(num));
    }

    public static String checkNumber(int num) {
        if (num > 0) {
            return num + " is positive.";
        } else if (num < 0) {
            return num + " is negative.";
        } else {
            return num + " is zero.";
        }
    }
}