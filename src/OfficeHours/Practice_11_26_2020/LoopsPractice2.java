package OfficeHours.Practice_11_26_2020;

import java.util.Scanner;

public class LoopsPractice2 {

    public static void main(String[] args) {

        /*
           salary calculator:
                hourlyRate
                weekLyHour
                tax rates: 30%
                continue?
         */
        Scanner scan = new Scanner(System.in);
        double hourlyRate = 0;
        int weeklyHour = 0;
        String answer = "";

        do { // becomes false if the answer is no

            System.out.println("Enter your hourlyRate");
            hourlyRate = scan.nextDouble();
            System.out.println("How many hours do you work in a week?");
            weeklyHour = scan.nextInt();
            double salary = weeklyHour * hourlyRate * 52;
            System.out.println("your salary: " + salary);
            double tax = salary * 0.3;
            System.out.println("Your tax: " + tax);
            double salaryAfterTax = salary - tax;
            System.out.println("Your salary after tax: " + salaryAfterTax);

            System.out.println("would you like to continue?");
            answer = scan.next().toLowerCase();

            while(  !(answer.equals("yes") || answer.equals("no"))  ){  // while the answer is invalid
                System.out.println("would you like to continue?");
                answer = scan.next().toLowerCase();
            }

        } while(answer.equals("yes"));










    }

}
