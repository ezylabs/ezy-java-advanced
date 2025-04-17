public class ChainedMethods {
   public static void main(String[] args) {
      String x = "abc";
      String y = x.concat("def").toUpperCase().replace("C", "x");
      System.out.println(y);
   }
}