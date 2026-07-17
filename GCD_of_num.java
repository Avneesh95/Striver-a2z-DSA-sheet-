
import java.util.Scanner;

/**
 * GCD_of_num
 */
public class GCD_of_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        System.out.println(gcd(num1, num2));
    }

//     //Iterative way 
               
    // Time Complexity: O(log(min(a, b)))

//     public static int gcd(int a, int b) {
//     while (b != 0) {
//         int temp = b;
//         b = a % b;
//         a = temp;
//     }
//     return Math.abs(a);

// }


//     Time Complexity: O(log(min(a, b)))


 public static int gcd(int a , int b)
 {
    if (b == 0) return Math.abs(a);
    return gcd(b, a % b);
 }
}
