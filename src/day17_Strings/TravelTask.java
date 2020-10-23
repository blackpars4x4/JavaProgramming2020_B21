package day17_Strings;

import java.util.Scanner;

public class TravelTask {

    /*
    - Travel

    - Make a cost variable to calculate how much the person will owe after everything:
    - Ask the user if they have a valid password (boolean)
        > if the user enters true:
            The base cost of the ticket should be set to: 1000
            Ask the user the country they to travel to (String, multiple word)
            Ask the user how many bags they will take with them (byte)
                > Each bag will add 50 to the cost
            Ask the user how many people they will travel with (short)
                > For each person the cost is reduced by 100. Up to a limit of 300.
            Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)
            Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


        > if the user enters false:
            The base cost of the passport renewal is: 200
            Ask the user when their passport expired(int)
                > Each year it was expired adds 75 to the cost
            Ask the user which countries they plan to travel it, written in one line, separating each country with a comma
            Ask the user if they will be traveling in the next year (String - yes or no)
                > If yes: add 100 to the cost
                > If no: subtract 50 from the cost
            Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cost = 0;

        System.out.println("Do you have a valid passport");
        String validPassport = input.next();

        if(validPassport.equalsIgnoreCase("yes")) {
            cost = 1000;

            System.out.println("Which country do you want to go to");
            input.nextLine();  // accept the enter input
            String country = input.nextLine();

            System.out.println("How many bags will you have");
            byte bags = input.nextByte();
            cost += (bags * 50);  // cost = cost + (bag * 50))

            System.out.println("How many people are you traveling with");
            short numOfPeople = input.nextShort();
            if(numOfPeople >= 3){
                cost -= 300;  // cost = cost - 300
            } else {
                cost -= (numOfPeople * 100);
            }

            System.out.println("Enter the name of the people you will travel with");
            input.nextLine(); // absorb the enter input
            String namesOfPeople = input.nextLine();

            System.out.println("Your ticket is booked to "  + country + ". We have charged extra for the " + bags + " bags but you are traveling with " + namesOfPeople + " so we are giving a discount. Your total cost is " + cost);


        } else {
            cost = 200;

            System.out.println("When did your passport expire");
            int expiredYears = input.nextInt();
            cost += (2020 - expiredYears) * 75;

            System.out.println("Which countries do you want to travel to");
            input.nextLine();  // accept the enter input
            String countries = input.nextLine();

            System.out.println("Will you be traveling in the next year");
            String areTraveling = input.next();
            if(areTraveling.equalsIgnoreCase("yes")) {
                cost += 100;
            } else {
                cost -= 50;
            }

            System.out.println("Looks like your password has been expired for " + expiredYears + ", but not to worry we will get it ready for you to travel to " + countries + ". Your total cost has come out to" + cost);

        }  // end of else block

    }
}
