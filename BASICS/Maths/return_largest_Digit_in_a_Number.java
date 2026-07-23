
import java.util.Scanner;

public class return_largest_Digit_in_a_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(largest(n));
        sc.close();
    }

    //time Complexity --> O(log10(n))  space complexity --> O(1)
    // private static int largest(int num)
    // {
    //     int greatest = num%10;
    //     while(num>0)
    //     {
    //         num= num/10;
    //         if(greatest < num%10 )
    //         {
    //             greatest = num%10;
    //         }
    //     }
    //     return greatest;
    // }



    // using Math.max 

    private static int largest(int num) {
        int greatest = 0;

        while (num > 0) {
            greatest = Math.max(greatest, num % 10);
            num /= 10;
        }

        return greatest;
    }
}
