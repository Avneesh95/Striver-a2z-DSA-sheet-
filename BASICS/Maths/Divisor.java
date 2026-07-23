
import java.util.Scanner;

public class Divisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        divi(num);
        sc.close();
    }

    //brute force  time complexity --> O(n)
    // public static void divi(int num) {

    //     for(int i = 1; i <= num; i++) {
    //         if (num % i == 0) {
    //             System.out.print(i +" ");
    //         }
    //     }
    // }


    // better approach time complexity O(root n)

    public static void divi(int n)
    {
        for(int i = 1 ; i*i<=n ; i++)
        {
            if(n%i == 0 )
            {
                System.out.print(i +" ");
                System.out.print(n/i +" ");

            }
        }
    }

}
