import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int i;
      double[] weight = new double[5];
      double total = 0;
      double average = 0;
      double max = 0;
      
      for (i = 0; i < 5; ++i) {
         System.out.print("Enter weight " + (i + 1) + ": ");
         weight[i] = scnr.nextDouble();
         System.out.println("");
      }
      System.out.println("");
      System.out.print("You entered: ");
      for (i = 0; i < 5; ++i) {
         System.out.print(weight[i] + " ");
      }
      System.out.println("");
      
      for (i = 0; i < 5; ++i) {
         total = total + weight[i];
      }
      System.out.println("Total weight: " + total);
      System.out.println("Average weight: " + (total / 5));
      
      for (i = 0; i < 5; ++i) {
         if (weight[i] > max) {
            max = weight[i];
         }
      }
      System.out.println("Max weight: " + max);
      
      return;
   }
}
