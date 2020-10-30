import java.util.*;

 // 4. Check given number is prime or not.


public class Prime {

    public static void main(String[] args) {

        int num = 7, i = 2;
        boolean flag = false;
        while(i <= num/2)
        {
            
            if(num % i == 0)
            {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
//Output:
//7 is a prime number.