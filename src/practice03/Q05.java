package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /*  Create an integer array by the help of user(ask user length and elements of array)
            Ask user the index of element that user wants to remove.
            Print the array on the console after removing
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenght array :");
        int lenght = input.nextInt();
        int[] arr = new int [lenght];
        for (int i = 0 ; i < arr.length ; i++ ){
            System.out.println("Enter the elment of index " + i);
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the index you want to remove ");
        int removeIdx = input.nextInt();
        int[] brr = new int[arr.length-1];
        int idx = 0;
        for (int i = 0 ; i < arr.length ; i++ ){
            if ( i == removeIdx ){
                continue;
            }else {
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}
