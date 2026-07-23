package BASICS.Arrays;

import java.util.Scanner;

/**
 * Check_array_is_sorted_1
 */
public class Check_array_is_sorted_1 {

    public static boolean isSorted(int[]arr)
    {
    
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i-1]>arr[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size_of_array = sc.nextInt();
        int []arr = new int[size_of_array];

        for(int i = 0 ; i < size_of_array ; i++ )
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr));

        sc.close();
    }

}