package day15_Scanner;

import java.util.Scanner;

public class Scanner_Boolean {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter true or false");
        boolean b = input.nextBoolean();

        System.out.println("Value: " + b);
        System.out.println("Opposite: " + !b);
    }

}
