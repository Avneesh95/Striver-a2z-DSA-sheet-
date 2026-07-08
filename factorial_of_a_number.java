
import java.util.Scanner;

public class factorial_of_a_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }



//     Time Complexity: O(n)
//     Space Complexity: O(1)

    private static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        int n = 1;
        while (num > 0) {
            n *= num;
            num--;
        }

        return n;

    }
}
