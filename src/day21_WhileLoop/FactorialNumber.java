package day21_WhileLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        long input = scanner.nextInt(); // long used for bigger value of result

        long result = 1;

        for (int i = (int)input; i >= 1; i--){
            result *= i;
        }
        System.out.println("Result: " + result);


    }
}
/*
FactorialNumber
2.  Write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */