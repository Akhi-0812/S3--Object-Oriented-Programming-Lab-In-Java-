import java.util.*;

 // 6.To find the factor of a given number. 

 
 
public class Factor {

  public static void main(String[] args) {

    
    int number = 36;

    System.out.println("Factors of " + number + " are: ");

    
    for (int i = 1; i <= number; ++i) {

      
      if (number % i == 0) {
        System.out.println(i + " ");
      }
    }
  }
}
//Output:
//Factors of 36 are: 
//1 
//2 
//3 
//4 
//6 
//9 
//12 
//18 
//36 