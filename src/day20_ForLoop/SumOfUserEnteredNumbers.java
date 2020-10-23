package day20_ForLoop;

import java.util.Scanner;

public class SumOfUserEnteredNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers user wants to enter? ");
        int times = scan.nextInt();
        int result = 0;

        for(int i = 1; i <= times; i++){
            System.out.println("Enter a number: " +i);
           result += scan.nextInt();
            System.out.println("Result = "+ result);
            System.out.println("End");
        }


    }
}
