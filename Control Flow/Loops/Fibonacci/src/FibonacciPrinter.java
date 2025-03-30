public class FibonacciPrinter {
    public static void main(String[] args) {
        printFibonacci();
    }

    public static void printFibonacci() {
        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
