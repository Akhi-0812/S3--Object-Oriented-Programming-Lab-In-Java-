import java.util.*;

 // 8.To find factorial of first n numbers.

 public class Factorial{
             
        public static void main(String args[]){
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter a number:");
               int n = sc.nextInt();
               int total = 0;
               int i = 1;
               while(i<=n){
                 int f = 1;
                 f = f * i;
                 total += f;
                 i++;
               }
               System.out.println("Factorial of first n numbers :"+ total);
        }
 }

//Output

//Enter a number:
//4
//Factorial of first n numbers :10