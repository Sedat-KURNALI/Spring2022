package day07;

import java.util.Scanner;

public class Day07Switch04 {

    public static void main(String[] args) {

        //Ask user to enter one of the +, -, *, /, % operations.
        //Ask user to enter two values then return the result of the operation

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        System.out.println("Enter one of the +, -, *, /, % operations");
        char opr = input.next().charAt(0);

        switch(opr){
            case '+':
                System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
                break;
            case '-':
                System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
                break;
            case '*':
                System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
                break;
            case '/':
                System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
                break;
            case '%':
                System.out.println(num1 + "%" + num2 + "=" + (num1*num2)/100);
                break;
            default:
                System.out.println("Enter a valid operator");
        }

        /*
            Note 1: String, int, char can be used in switch parenthesis
            Note 2: boolean, long, float, double cannot be used in switch parenthesis
         */

    }
}