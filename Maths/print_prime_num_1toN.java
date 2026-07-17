
import java.util.Scanner;

/**
 * print_prime_num_1toN
 */
public class print_prime_num_1toN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printPrime(num);
    }

    public static void printPrime(int n)
    {
        boolean []prime = new boolean [n+1];

        for(int i = 0 ; i < n; i ++)
        {
            prime[i] = false;
        }

        //Sieve

       for (int i = 2; i*i <= n; i++) {
            if (prime[i]==false) {
                // false the multiple of i
                for(int j = i*i ; j <= n; j+=i)
                {
                    prime[j]= true;
                }
            }

        }

        for(int i = 2 ; i <n ; i ++)
        {
            if(prime[i]==false)
            {
                System.out.print(i+" ");
            }
        }
    }

}