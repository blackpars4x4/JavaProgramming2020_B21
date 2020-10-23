package day15_Scanner;

import java.util.Scanner;
//import day14_Switch_Recap.SalaryCalculator;
// If we wanted to Use the SalaryCalculator class in this class, we import it

public class Scanner_Int {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Scanner object called scanner

        System.out.println("Enter number one:");
        int numOne = scanner.nextInt(); // reading an int number
        // int numOne = 9000; -> Hard coding/ fixed value,
        // but with Scanner it can dynamic
        System.out.println("Enter number two:");
        int numTwo = scanner.nextInt(); // reading an int number

        System.out.println("Number one: " + numOne);
        System.out.println("Number two: " + numTwo);
        System.out.println("Sum " + (numOne + numTwo));

        // All the object are print statements, using the variable we have
    }
}
