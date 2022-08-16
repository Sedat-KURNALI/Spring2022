package day10;

public class Day10ForLoop02 {
    public static void main(String[] args) {
        String s="Sedat KURNALI";
        String reversed = "";
        for (int i = s.length()-1 ; i >= 0 ; i-- ){
            reversed += s.charAt(i);
        }
        System.out.println(reversed);
        System.out.println("\n==================");
        int sumOfDigits =0;

        for (int i = 237 ; i > 0 ; i= i / 10){
            sumOfDigits =  sumOfDigits % 10;
        }



    }
}
