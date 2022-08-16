package practice01;

import java.util.Scanner;

public class Q04 {
    //Type a code that calculates the hypotenuse.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the first of the right triangle ");
        double a = input.nextDouble();

        System.out.println("Enter the length of the second of the right triangle ");
        double b = input.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hypotenuse = " + hypotenuse);

    }
}
