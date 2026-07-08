
import java.util.Scanner;

public class count_the_number_of_odd_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(count(num));
    }


    // Approach 1 --> time complexity O(n) Space Complexity O(1)
    private static int count(int num)
    {
        int digit = 0;
        while(num>0)
        {
            
            if((num%10)%2!=0)
            {
                digit ++;
            }
            num/=10;
        }
        return digit;
    }
}
