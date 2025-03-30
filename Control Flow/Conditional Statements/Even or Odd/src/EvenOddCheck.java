import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println(checkEvenOdd(num));
    }

    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? (num + " is even.") : (num + " is odd.");
    }
}