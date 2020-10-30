import java.util.*;

 // 9.To check given number is palindrome or not.

 public class Palindrome{
   
   public static void main(String args[]){
     
     int number = 1331, reversed_num = 0, original_num,remainder;
     original_num = number;
     while(number != 0){
       remainder = number%10;
       reversed_num = reversed_num * 10 + remainder;
       number = number/10;
     }
     
     if(original_num == reversed_num)
       System.out.println(original_num + " is a palindrome number.");
       
     else
       System.out.println(original_num + "is not a palindrome number.");
   }
 }
    
    //Output:
    
    //1331 is a palindrome number.