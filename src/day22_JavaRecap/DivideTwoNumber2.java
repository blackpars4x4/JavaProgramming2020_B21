package day22_JavaRecap;

import java.util.Scanner;

public class DivideTwoNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int count =0;

        for( count = 0; a >= b; count++ ){
            a -= b;
        }

        System.out.println(count+" with a remainder of "+a);
    }
}
