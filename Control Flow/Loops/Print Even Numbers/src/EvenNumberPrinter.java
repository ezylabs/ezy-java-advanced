public class EvenNumberPrinter {
    public static void main(String[] args) {
        printEvenNumbers();
    }

    public static void printEvenNumbers() {
        int num = 2;
        while (num <= 20) {
            System.out.println(num);
            num += 2;
        }
    }
}