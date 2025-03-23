public class ByteOverflow {
   public static void main(String[] args) {
      byte b = 127;
      System.out.println("Byte max value: " + b);
      b++; // Overflow
      System.out.println("After increment: " + b);

      byte min = -128;
      System.out.println("Byte min value: " + min);
      min--; // Underflow
      System.out.println("After decrement: " + min);
   }
}