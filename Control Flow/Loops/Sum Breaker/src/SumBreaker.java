public class SumBreaker {
    public static void main(String[] args) {
        calculateSum();
    }

    public static void calculateSum() {
        int sum = 0, i = 1;
        while (true) {
            sum += i;
            if (sum > 50) break;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}