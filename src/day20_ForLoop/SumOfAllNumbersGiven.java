package day20_ForLoop;

import java.util.Scanner;

public class SumOfAllNumbersGiven {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int result = 0;
        for(int i=1; i <= number; i++){
            result += i;
        }
        System.out.println("Sum of the number is : " + result);
    }
}
