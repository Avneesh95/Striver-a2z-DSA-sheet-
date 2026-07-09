
import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isPerfect(num));
    }


    //  time complexity --> O( n)  , space complexity --> O(1)

//     private static boolean isPerfect(int num)
//     {
//         int sum = 0;
//         int i = 0;
//         while(++i<num)
//         {
//             if(num%i ==0)
//             {
//                 sum+=i;
//             }
            
//         }

//         return sum==num;
//     }
// }


  // OPTIMAL APPROACH --> time complexity --> O(root n)  , space complexity --> O(1)
private static boolean isPerfect(int num)
{
    if (num <= 1)
        return false;

    int sum = 1; // 1 is always a proper divisor

    for (int i = 2; i * i <= num; i++)
    {
        if (num % i == 0)
        {
            sum += i;

            if (i != num / i) // avoid adding square root twice
            {
                sum += num / i;
            }
        }
    }

    return sum == num;
}
