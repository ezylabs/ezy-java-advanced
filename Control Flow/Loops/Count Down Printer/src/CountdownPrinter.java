public class CountdownPrinter {
    public static void main(String[] args) {
        printCountdown();
    }

    public static void printCountdown() {
        int n = 5;
        do {
            System.out.println(n);
            n--;
        } while (n > 0);
    }
}