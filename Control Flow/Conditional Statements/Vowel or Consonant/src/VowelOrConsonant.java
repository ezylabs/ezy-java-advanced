import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        System.out.println(checkVowelOrConsonant(ch));
    }

    public static String checkVowelOrConsonant(char ch) {
        char lowerChar = Character.toLowerCase(ch);
        switch (lowerChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return ch + " is a vowel.";
            default:
                return ch + " is a consonant.";
        }
    }
}