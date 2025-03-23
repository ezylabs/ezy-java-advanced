import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int num = Integer.parseInt(str);
        double decimal = Double.parseDouble(str);
        boolean bool = Boolean.parseBoolean(str);

        System.out.println("String: \"" + str + "\"");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + decimal);
        System.out.println("Boolean: " + bool);
    }
}