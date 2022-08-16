package day03;

public class Day03ObjectCreation {
/*
    We learnt hoır to creote tenplate
    l)How to create a elass
    2)How to creote a stetnod in a elass
    3)How to creote variaoles in o elass
        How to creote object fron a elass */

    public static void main(String[] args) {
        Day03ObjectCreation myObject = new Day03ObjectCreation();
        System.out.println(myObject.height);//185
        System.out.println(myObject.printName("Mark","Twain"));//Mark Twain

        System.out.println(myObject.id);
        System.out.println(myObject.calculateAge(2000));



    }
    public String printName(String firstName, String lastName){

        return firstName+" "+ lastName;
    }
    public int calculateAge( int dob){

        return 2022 - dob;
    }
    int height = 185;
    String id = "Sp2022-001";
}
