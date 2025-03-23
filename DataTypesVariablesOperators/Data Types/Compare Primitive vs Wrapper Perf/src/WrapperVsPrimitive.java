public class WrapperVsPrimitive {
   public static void main(String[] args) {
      long start, end;

      int sum = 0;
      start = System.nanoTime();
      for (int i = 0; i < 10_000_000; i++) {
         sum += i;
      }
      end = System.nanoTime();
      System.out.println("Time taken using int: " + (end - start) / 1_000_000 + " ms");

      Integer sumWrapper = 0;
      start = System.nanoTime();
      for (int i = 0; i < 10_000_000; i++) {
         sumWrapper += i;
      }
      end = System.nanoTime();
      System.out.println("Time taken using Integer: " + (end - start) / 1_000_000 + " ms");
   }
}