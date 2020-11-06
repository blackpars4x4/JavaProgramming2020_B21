package Day25_ArrayIntro;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul" , "Aug", "Sep", "Oct", "Nov", "Dec" };
        //index:            0      1      2      3      4      5      6       7      8      9     10      11

        System.out.println("Enter the number: ");
        int number = scan.nextInt();

        System.out.println(month[number-1]);



    }
}
