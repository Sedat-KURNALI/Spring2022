package day10;

public class Day10ForLoopSedat01 {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 5 ; i++){
            System.out.println("Hi! " + i);
        }

        System.out.println("==================");

        for ( int i = 10 ; i >= 3 ; i--){
            System.out.print( i + " " );
        }

        System.out.println("\n==================");

        for ( int i = 4 ; i <= 15 ; i++){
            if (i%2==0){
                System.out.print( i + " " );
            }
        }
        System.out.println("\n==================");
        for ( int i = 4 ; i <= 15 ; i+=2){
            System.out.print( i +" ");
        }
        System.out.println("\n==================");
        for ( int i = 4 ; i <= 15 ; i++){
            if (i%2!=0){
                System.out.print( i + " " );
            }
        }
        System.out.println("\n==================");
        for ( int i = 10 ; i <= 32 ; i++){
            if (i!=17){
                System.out.print( i + " " );
            }
        }
        System.out.println("\n==================");
        for ( int i = 10 ; i <= 32 ; i++){
            if ((i<21)&&(i>18)){
                System.out.print( "" );
            }else System.out.print( i + " " );
        }
        System.out.println("\n==================");

        String str = "Publix is the best";
        for ( int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i)!='x'){
                System.out.print( str.charAt(i));
            }else break;
        }
        System.out.println("\n==================");

    }
}
