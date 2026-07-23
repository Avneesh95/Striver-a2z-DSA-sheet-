package BASICS.Arrays;

import java.util.Scanner;


/**
 * Sum_Of_Element
 */
public class Sum_Of_Element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int []arr = new int[n];
        int sum = 0;
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        System.out.println(sum);
        sc.close();
    }

    //  Time Complexity: O(n)
}