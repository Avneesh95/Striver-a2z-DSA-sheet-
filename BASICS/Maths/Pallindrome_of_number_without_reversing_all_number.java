
import java.util.Scanner;



//optimized way without check all numbers

public class  Pallindrome_of_number_without_reversing_all_number {
    
    public static boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0))
        return false;

    int rev = 0;

    while (x > rev) {
        rev = rev * 10 + x % 10;
        x /= 10;
    }

    return x == rev || x == rev / 10;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();

    System.out.println(isPalindrome(s));

    sc.close();
}
}
