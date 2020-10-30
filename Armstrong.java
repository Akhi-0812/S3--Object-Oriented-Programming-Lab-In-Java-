import java.util.*;

 // 10.Check whether a given number is amrstrong or not .

public class Armstrong {
   public static void main(String args[]) {
      int number = 153;
      int check,remainder, sum = 0;
      check = number;
      while(check != 0) {
         remainder = check % 10;
         sum = sum + (remainder * remainder * remainder);
         check = check / 10;
      }
      
      if(sum == number)
         System.out.println(number + " is an armstrong number.");
         
      else
         System.out.println(number + " is not an armstrong number.");
   }
}
   
   //Output:
   
   // 153 is an armstrong number.