package day11;

public class Day11WhileLoop02 {
    public static void main(String[] args) {
        int i = 1455410;
        String strInt = String.valueOf(i);
        String reverse = "";
        int idx = strInt.length()-1;
        while(idx > -1){
            reverse = reverse + strInt.charAt(idx);
            idx--;
        }
        System.out.println(strInt);
        System.out.println(reverse);
        if(strInt.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");

        }


    }
}
