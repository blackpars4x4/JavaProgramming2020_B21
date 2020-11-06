package day22_JavaRecap;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name ");
        String f = scan.nextLine();

        System.out.println("Enter your last name ");
        String l = scan.nextLine();

        scan.close();

        String initial = f.substring(0,1).toUpperCase()+ "." +l.substring(0,1)+ ".";

        System.out.println("initial= "+initial);


    }
}
