package day15_Scanner;

import java.util.Scanner;

public class Scanner_Intro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte number: ");
        byte b = input.nextByte();

        System.out.println("Our number is: " + b);
        System.out.println("plus one: " + (b + 1));
    }


}
