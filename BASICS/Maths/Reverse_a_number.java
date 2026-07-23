
import java.util.Scanner;

/**
 * Reverse_a_number
 */
public class Reverse_a_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(reverse(num));
        System.out.println(isPallindrome(num));
    }

    // time complexity --> 0(log10(n)) for reversing a number  , Space complexity --> O(1)
    public static int reverse(int num)
    {
        int newNum = 0;
        while(num>0)
        {
            newNum =(newNum*10)+num%10;
            num/=10;

        }
        return newNum;
    }


    //Check Pallindrome   time complexity --> O(1)

    private static boolean isPallindrome (int num)
    {
        if(reverse(num)==num)
        {
            return true;
        }
        return false;
    }
}


