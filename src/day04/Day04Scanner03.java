package day04;

import java.util.Scanner;

public class Day04Scanner03 {
    /**
     Ask user enter the width and the lenght of rectangle and print the area and the perimeter on the consule
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width of the rectangular prism =");
        double width = input.nextDouble();
        System.out.println("Enter lenght of the rectangular prism=");
        double lenght = input.nextDouble();
        System.out.println("Enter lenght of the rectangular prism=");
        double height = input.nextDouble();

        System.out.println("Volume of Rectengular prism = " + width*lenght*height);

    }



}
