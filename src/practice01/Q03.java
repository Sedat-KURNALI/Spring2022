package practice01;

import java.util.Scanner;

public class Q03 {
    // Write a Java program to break an integer into a sequence of individual digits.
    // Hint: use / and %
    // x: input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5
    public static void main(String[] args) {
        /*
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number ");
            int num = input.nextInt();
         */
        int x = 12345;
        int ones = x % 10;
        int tens = (x / 10) % 10 ;
        int hundreds = (x / 100) % 10 ;
        int thousands = (x / 1000) % 10 ;
        int tenThousands = (x / 10000) % 10 ;

        System.out.println(x);
        System.out.println(tenThousands+"\n"+thousands+"\n"+hundreds+"\n"+tens+"\n"+ones);





    }
}
