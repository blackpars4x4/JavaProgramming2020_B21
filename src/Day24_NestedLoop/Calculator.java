package Day24_NestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;

        while(true) {
            System.out.println("Enter number 1: ");
            int num1 = scan.nextInt();
            System.out.println("Enter number 2: ");
            int num2 = scan.nextInt();

            result = num1 + num2;
            System.out.println("Result: " + result);

            System.out.println("would like to continue? ");
            String answer = scan.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid Entry, Please re-enter");
                System.out.println("would like to continue?");
                answer = scan.nextLine().toLowerCase();

            if(answer.equals("no")){
                break;

            }
            /*else{
                System.err.println("Invalid Entry");
                System.exit(0);*/


            }


        }


    }
}
/*
 1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
 then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is neither yes or no, the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
 */