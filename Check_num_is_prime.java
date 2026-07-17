
import java.util.Scanner;

/**
 * Check_num_is_prime
 */
public class Check_num_is_prime {

    public static void main(String[] args) {

        //taking input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //printing number
        System.out.println(isPrime(n));
        sc.close();
    }

    //check for prime number
//     public static boolean isPrime(int n)
//     {
//         // initilize count with 0 because be know that prime number have only 2 factors
//         int count = 0;
//         // loop will check the number of factors
//         for(int i = 1 ; i<=n ; i++)
//         {
//             if(n%i == 0)
//             {
//                 count++;
//             }
//         }
//         // return true if satisfy the conditon else return false
//         return count==2;
//     }
// }
// Conclusion this will work but that efficient it takes O(n) time and space complexity will be O(1)
// Now we move to the efficient way which will take O(root n)

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

