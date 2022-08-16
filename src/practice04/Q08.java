package practice04;

import java.util.Arrays;

public class Q08 {
    /*
        Write code to find the sum of the dollars and sum of the euros in the given string.
    */
    public static void main(String[] args) {
        String s = "$1 $12 €34 €56 $45 €78";
        String[] arr = s.split(" ");
        System.out.println(s);
        System.out.println(Arrays.toString(arr));
        int sumDollars = 0;
        int sumEuros = 0;
        for(String w:arr){
            if (w.contains("$")){
                sumDollars = sumDollars + Integer.valueOf(w.replace("$",""));
            }
            if (w.contains("€")){
                sumEuros = sumEuros + Integer.valueOf(w.replace("€",""));
            }
        }
        System.out.println("Sum of $ is :  " + sumDollars);
        System.out.println("Sum of € is :  " + sumEuros);
    }
}
