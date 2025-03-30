public class NamePrinter {
    public static void main(String[] args) {
        printNames();
    }

    public static void printNames() {
        String[] names = {"Rahul", "Rocky", "Rambo"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
