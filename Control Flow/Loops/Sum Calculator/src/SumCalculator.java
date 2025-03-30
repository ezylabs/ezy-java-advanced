public class SumCalculator {
    public static void main(String[] args) {
        calculateSum();
    }

    public static void calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}