package day02;

public class Day02MethodCreation {
    public static void main(String[] args) {
        System.out.println(addIntegers(12,5));
        System.out.println(multiplyIntegers(8, 5));
        System.out.println(subtractInteger(12, 7));
        System.out.println(divideIntegers(24.6, 2));
    }
    //Create an addition method
    public static int addIntegers(int a, int b){
        return a+b;
    }
    //Create a multiplication method
    public static int multiplyIntegers(int a, int b){
        return a*b;
    }
    //Create a subtraction method
    public static int subtractInteger(int a, int b){
        return a-b;
    }
    //Create a division method
    public static double divideIntegers(double a, int b){
        return a/b;
    }
    // Note 1: If you use same data types all values in a mathematical operation, the result
    //         will be in the same data type
    // Note 2: If you use different data types all values in a mathematical operation, the result
    //         will be in the largest data type. Example; double / int ==>> double
}
