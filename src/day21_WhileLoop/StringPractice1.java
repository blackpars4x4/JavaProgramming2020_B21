package day21_WhileLoop;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine(); //"Java"

        int lastIndex = word.length() - 1;
        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println("" + f + l);
        //                  106 +  97 = 203

        String r1 = "Batch " + 2 + 1;
        //          "Batch 2" + 1
        //          "Batch 21"

        System.out.println("===============================================");

        while (true) {
            System.out.println("Enter building number: ");
            String building = scan.next();  // 220Enter
            scan.nextLine(); // Enter

            System.out.println("Enter street name: ");
            String street = scan.nextLine();

            System.out.println("Enter your apartment number: ");
            String apartment = scan.next();
            scan.nextLine();

            System.out.println("Enter your city name: ");
            String city = scan.nextLine(); // McLeanEnter

            System.out.println("Enter your state name:");
            String state = scan.nextLine();

            System.out.println("Enter your Zip Code:");
            int zip = scan.nextInt();

            String fullAddress = building + " " + street + ", Apt# " + apartment + "\n" + city + ", " + state + " " + zip;
            System.out.println(fullAddress);

            System.out.println("Would you like to Continue? Yes, No");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}