In Java, we can take input from the user using the `Scanner` class.

### Example: Asking for the User’s Name

```java
// Import Scanner class
import java.util.Scanner; 

public class UserInputExample {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter your name: ");

        // Read user input
        String name = scanner.nextLine(); 
        
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }
}
```