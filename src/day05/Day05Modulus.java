package day05;

import java.util.Scanner;

public class Day05Modulus {
    public static void main(String[] args) {

        /*
             Modulus Operator : % is called modulus operator in JAVA
                                It returns the remainder in a division operation
                                13 % 5 ==> 3
         */

        System.out.println(13%5);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = input.nextInt();
        System.out.println(num % 10);
        int absN = input.nextInt();;

        int lastDigit = absN % 10;

        System.out.println(lastDigit);

        int lastTwoDigits = absN % 100;
        System.out.println(lastTwoDigits);

        // Ask user number even
        System.out.println(" Is the number even ? " + (absN % 2 == 0));

        // Ask user number odd
        System.out.println(" Is the number odd ? " + (absN % 2 != 0));



        //Ask user to enter 3 digit integer to find the sum of the  digits


        int last = absN % 10;
        int second = (( absN - last) % 100) / 10;
        int first = ((absN - (absN % 100))/100) % 10;

        System.out.println(first +  second + last);







    }
}
