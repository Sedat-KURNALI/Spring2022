package day05;

import java.util.Scanner;

public class Day05IfStatement {
    /*
        If you score is less then 50 you will fail
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Exam Score = ");
        int n = input.nextInt();;
        if (n < 50){
            System.out.println("You are fail ");
        }else
            System.out.println("Congratulations");

        //  if the integer got from user is divided by 3 or not
        if(n%3==0){
            System.out.println("Number is divided by 3");
        }
        if(n%3!=0){
            System.out.println("Number is NOT divided by 3");
        }


        System.out.println("Enter the initial of the day name");
        String s= input.next();
        if(s.equals("S")){
            System.out.println("Saturday and Sunday");
        }
        if(s.equals("T")){
            System.out.println("Tuesday and Thursday");
        }
        if(s.equals("M")){
            System.out.println("Monday");
        }
        if(s.equals("F")){
            System.out.println("Friday");
        }
    }
}
