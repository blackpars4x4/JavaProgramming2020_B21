package day15_Scanner;

/*
- Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
and ask them if they are a student (boolean).
Print all the values from the inputs
 */

import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Please enter your age");
        byte age = info.nextByte();

        System.out.println("Please enter your favorite number");
        long favNum = info.nextLong();

        System.out.println("Are you a student? Enter true or false");
        boolean isStudent = info.nextBoolean();

        System.out.println("Age: " + age);
        System.out.println("Favorite number: " + favNum);

        if(isStudent) {
            System.out.println("Great, you are a student!");
        } else {
            System.out.println("Oh okay, you are not a student");
        }


    }

}
