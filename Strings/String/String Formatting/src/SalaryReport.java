public class SalaryReport {
   public static void main(String[] args) {
      // Employee data stored in arrays
      String[] names = {"Rahul", "Rocky", "Rambo"};
      int[] ages = {25, 30, 28};
      double[] salaries = {50000.5052, 60000.75, 70000.100};

      // Print table header
      System.out.printf("%-10s | %5s | %10s%n", "Name", "Age", "Salary");
      System.out.println("-----------------------------------");

      for (int i = 0; i < names.length; i++) {
         // Print employee details
         System.out.printf("%-10s | %5d | %10.2f%n", names[i], ages[i], salaries[i]);
      }
   }
}