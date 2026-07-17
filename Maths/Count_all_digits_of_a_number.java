

import java.util.Scanner;
import java.util.*;

/**
 * Count_all_digits_of_a_number
 */
public class Count_all_digits_of_a_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(count(num));
    }

    // Approach 1.  Optimal approach time complexity is o(1) space complexity O(1)

    private static int count(int num)
    {
        return (int)(Math.log10(num))+1;
    }

    //Approach 2  time complexity is O(n) and space complexity is O(1).

    // private static int count(int num)
    // {
    //     int digit = 0 ;
    //     while(num>0)
    //     {
    //         digit++;
    //         num = num/10;
    //     }
    //     return digit;
    // }

}