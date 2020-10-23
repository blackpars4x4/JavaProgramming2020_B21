package day16_Scanner;

import java.util.Scanner;

public class WarmUpTask {

    /*
       	1.  write a program for a rate calculator: RateCalculator
            1. asks the user to enter a salary (double)
            2. asks the user how many hours he/she works in a week (as int)
            3. print the hourly rate (double) of the employee

            assume that one year has 52 weeks

            hourRate = salary / (weeklyHour * 52)

     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        System.out.println("Enter your hours per week");
        int hours = input.nextInt();

        double hourlyRate = salary / (hours * 52);
        System.out.println("Your hourly rate is: " + hourlyRate);
    }

}
