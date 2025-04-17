public class ReceiptFormatter {
    public static void main(String[] args) {
        // Print the receipt using \n for new lines and \t for spacing
        System.out.print(
                "=====================================\n" +
                        "Product\t\tPrice\n" +
                        "-------------------------------------\n" +
                        "Laptop\t\t$1200\n" +
                        "Phone\t\t$800\n" +
                        "Tablet\t\t$400\n" +
                        "=====================================\n"
        );
    }
}