import java.util.Scanner;

/**
 * Armstrong
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isArmstrong(num));
    }

// private static boolean isArmstrong(int num) {
//     int original = num;

//     // Count digits
//     int temp = num;
//     int digits = 0;
//     while (temp > 0) {
//         digits++;
//         temp /= 10;
//     }

//     int sum = 0;
//     temp = num;

//     while (temp > 0) {
//         int digit = temp % 10;

//         int power = 1;
//         for (int i = 0; i < digits; i++) {
//             power *= digit;
//         }

//         sum += power;
//         temp /= 10;
//     }

//     return sum == original;
// }




private static boolean isArmstrong(int num) {
    int original = num;

    // Count digits
    int digits = String.valueOf(num).length();

    int sum = 0;

    while (num > 0) {
        int digit = num % 10;
        sum += Math.pow(digit, digits);
        num /= 10;
    }

    return sum == original;
}

}



