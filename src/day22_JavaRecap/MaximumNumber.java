package day22_JavaRecap;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {


        /**scanner object: 1
        *
        * "Enter a number":5
        * nextInt(): 5
        *
        * "Maximum number is: " ...: 1*/

        Scanner scan = new Scanner(System.in);

        int max = -99999999;

        for(int i = 1; i <= 5; i++){
            System.out.println("Enter a Number: ");
            int n = scan.nextInt();

            if (n > max){
                max = n;
            }
        }
        System.out.println("Maximum number is: " + max);


    }
}
