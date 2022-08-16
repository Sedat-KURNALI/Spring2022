package practice04;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*  Write a Java program to take the last three characters
            from a given string and add these three characters
            at both the front and back of the string.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = input.nextLine();
        if(str.length()<3){
            System.out.println("Enter a string that has more than 2 characters");
        }else {
            String lastThreeChars = str.substring(str.length()-3);
            System.out.println(lastThreeChars+str+lastThreeChars);
        }
    }
}
