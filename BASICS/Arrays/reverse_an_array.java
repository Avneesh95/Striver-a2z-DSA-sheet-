package BASICS.Arrays;

import java.util.*;

/**
 * reverse_an_array
 */
public class reverse_an_array {

    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int []arr = new int[size];

    for(int i = 0 ; i < size ; i++)
    {
        arr[i] = sc.nextInt();
    }

    System.out.print(Arrays.toString(reverse(arr)));
    sc.close();
    }


public static int[] reverse(int []arr)
{
    int i = 0;
    int j = arr.length-1;
    while(i<j)
    {
        swap(arr,i,j);
        i++;
        j--;
    }
    return arr;
}

public static void swap(int []arr , int a , int b)
{
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
}