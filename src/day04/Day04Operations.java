package day04;

public class Day04Operations {
    /*
        Operations in Java
        1) +, -, * ,/
            Order of Operations:    i)   Operation inside parenthesis
                                    ii)  Multiplication and Division
                                    iii) Addition and Subtraction
        2) Increment and Decrement operation
            Increment ==> Addition and Multiplication
            Decrement ==> Subtraction and Division
        3) Comparison operator
            >, <, >=, <=, ==, !=
            Note: In math, simple equal sign
            Note: In Java, '!' means 'not' so '!='
            Note: All Comparison operator return boolean value
        4) Logical operators
            i)  AND Operator : && ==> This operator is used between two boolean value
                 1 && 1 = 1    0 && 1 = 0     1 && 0 = 0    0 && 0 = 0
            ii) OR Operator : || ==> This operator is used between two value
                 1 || 1 = 1    0 || 1 = 1     1 || 0 = 1    0 || 0 = 0
    */
    public static void main(String[] args) {
        int result = 10 - 6/( 2 + 5 / 5 )+7; //15
        System.out.println(result);

        int a = 12;
        //a = a + 3;
        a += 3;
        System.out.println(a);


        int b = 4;
        //    b = b * 3;
        b *=3;
        System.out.println(b);

        //Decrement
        int c = 18;
        c -= 3;
        System.out.println(c);

        int d = 24;
        d /= 6;
        System.out.println(d);

        int e = 12;
        e = e + 1;
        e += 1;
        e++;
        // ++e;
        System.out.println(e);

        int f = 13;
        f = f - 1;
        f -= 1;
        f--;
        // --f;

        //Comparison operator
        int h = 12;
        int i = 13;
        System.out.println(h<i);

        System.out.println(h==i);

        System.out.println(h<=i);

        System.out.println(h!=i);

        //Logical operator
        System.out.println(3<4 && 5>1);
        System.out.println(3>4 && 5>1);

        System.out.println(5>4 || 5>6);
        System.out.println(1<3 || 1>1);

        //Post Increment
        int x = 12;
        int y = x++;
        System.out.println(y);
        System.out.println(x);

        //Pre Increment
        int m = 12;
        int n = ++m;
        System.out.println(n);
        System.out.println(m);

    }
}
