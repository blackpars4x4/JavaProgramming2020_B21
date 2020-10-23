package day15_Scanner;

public class ExtraTasksSolution_Oct12 {

    public static void main(String[] args) {

      /*
        Given a house type (String) print out the number of max occupants (int)
            Tree house: 1
            Mobile home: 2
            Apartment: 4
            Town house: 6
            Villa: 8
            Mansion: 10
       */

        String houseType = "Villa";
        int houseMaxOccupants = 0;

        switch (houseType) {
            case "Tree house":
                houseMaxOccupants = 1;
                break;
            case "Mobile home":
                houseMaxOccupants = 2;
                break;
            case "Apartment":
                houseMaxOccupants = 4;
                break;
            case "Town house":
                houseMaxOccupants = 6;
                break;
            case "Villa":
                houseMaxOccupants = 8;
                break;
            case "Mansion":
                houseMaxOccupants = 10;
                break;
            default:
                System.out.println("Invalid house type");
        }

        System.out.println(houseType + " can hold " + houseMaxOccupants + " people");


        System.out.println("============================================================================");


        /*
        Given a letter (char) determine if the character is an uppercase letter or lowercase letter
        Ex: 'b'  --> lowercase
            'G'  --> uppercase
            'O'  --> uppercase
        */

        char letter = 'e';

        if (letter >= 65 && letter <= 90) {
            System.out.println(letter + " is uppercase");
        } else if (letter >= 97 && letter <= 122) {
            System.out.println(letter + " is lowercase");
        } else {
            System.out.println("Not a valid letter");
        }

        System.out.println("============================================================================");

        /*
        Given 3 numbers (int) and a boolean calculate a number based on these conditions:
        - If the first number is even, multiple it by 5, but if it's odd, multiple it by 10.
        - If the last number is a multiple of 5 divide it by 5, but if the number is not divide it by 2
        - If the given boolean is true:
            - add all the numbers together
            - After adding the numbers if the total value is divisible by 10 evenly then print the number, otherwise print "invalid result"
        - If the given boolean is false:
            - multiple all the numbers together
            - After multiplying the numbers, if the number is odd, then print it, otherwise print "invalid result"
         */

        int numOne = 1;
        int numTwo = 5;
        int numThree = 9;
        boolean check = false;
        int finalResult = 0;

        if (numOne % 2 == 0) {
            numOne *= 5;
        } else {
            numOne *= 10;
        }

        if (numThree % 5 == 0) {
            numThree /= 5;
        } else {
            numThree /= 2;
        }

        if (check) {
            finalResult = numOne + numTwo + numThree;
            if (finalResult % 10 == 0) {
                System.out.println(finalResult);
            } else {
                System.out.println("Invalid result");
            }
        } else {
            finalResult = numOne * numTwo * numThree;
            if (finalResult % 2 == 1) {
                System.out.println(finalResult);
            } else {
                System.out.println("Invalid result");
            }
        }

        System.out.println("============================================================================");

        /*
        Given a number(long) determine and print how many digits it has.

        - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"
        Ex: 124 --> 3 digits
            13213 --> 5 digits
            883218 --> Invalid number
            23 --> 2 digits
         */

        long longNum = 34241;

        if (longNum > 0 && longNum < 10) {
            System.out.println("1 digit");
        } else if (longNum >= 10 && longNum < 100) {
            System.out.println("2 digits");
        } else if (longNum >= 100 && longNum < 1000) {
            System.out.println("3 digits");
        } else if (longNum >= 1000 && longNum < 10000) {
            System.out.println("4 digits");
        } else if (longNum >= 10000 && longNum < 100000) {
            System.out.println("5 digits");
        } else {
            System.out.println("Invalid number");
        }

        System.out.println("============================================================================");

        /*
        Given a number(byte) grade level determine and print which school type someone is in.
            1-5: Elementary school
            6-8: Middle school
            9-12: High school
            13-16: College
            17-18: Grad School
            Other: Invalid grade level given
         */

        byte gradeLevel = 12;

        switch (gradeLevel) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Elementary School");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Middle School");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("High School");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                System.out.println("College");
            case 17:
            case 18:
                System.out.println("Grad School");
                break;
            default:
                System.out.println("Invalid grade level");
        }

    }
}
