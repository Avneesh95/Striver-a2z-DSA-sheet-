
import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(LCM(num1, num2));
    }


    // LCM --> a*b/gcd(a,c);   ------>O(log(min(num1, num2)))

 public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

public static int LCM(int num1, int num2) {
    return (num1 / gcd(num1, num2)) * num2;
}
}
