public class OddNumberPrinter {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static void printOddNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}