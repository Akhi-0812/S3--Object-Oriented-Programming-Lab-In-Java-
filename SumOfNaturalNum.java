import java.util.*;

 // 5.To find the sum of first n natural numbers.

 
import java.util.Scanner;
public class SumOfNatutalNum {
   public static void main(String args[]){
      int sum = 0;
      System.out.println("Enter the number value: ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      for (int i = 0; i<=num; i++){
         sum = sum +i;
      }
      System.out.println("Sum of numbers : "+sum);
   }
}
//Output:
//Enter the number value: 
//3
//Sum of numbers : 6