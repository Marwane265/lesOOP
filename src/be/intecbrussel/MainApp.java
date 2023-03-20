package be.intecbrussel;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        //OOP -> Object Oriented Programming

//        String str = new String("Enter a number:");
//        System.out.println(str);
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        System.out.println(num);


        //byte, short, int, long, float, double, char en boolean

        //Wrapper classes
        //=>Primitieve datatype
        byte number = 10;

        //=>Wrapper classes
        Byte number01 = 10;
        Short number02 = 20;
        Integer number03 = 30;
        Long number04 = 40L;


        System.out.println(number04.intValue());
//
//
//        String numToString = number03.toString();
//        System.out.println(numToString.length());


//        System.out.println(number04.equals(number03));


        // -128 tot 127 => dit is een range van een byte
        //Wrapper class heeft een stukje geheugen van deze range
        Long num01 = 128L;
        Long num02 = 128L;

        System.out.println(num01 == num02);


        Long num03 = 123L;
        Long num04 = 123L;

        System.out.println(num03 == num04);


        Byte bOne = 12;
        Byte bTwo = 12;
        Byte bThree = 12;
        Byte bFour = 12;

        System.out.println(bOne == bThree);
        System.out.println(bTwo.equals(bFour));

    }


}

