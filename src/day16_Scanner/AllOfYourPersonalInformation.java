package day16_Scanner;

import java.util.Scanner;
/*
Task:

	Ask the user how many people they live with?
        if user lives with Less than 2 people: print "Live with less than 2 people"
        if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
        if the user lives with more than 6 people: print "Live with "more than 6 people"
    Ask the user what city they live in?
    Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
            if they have thought about it print "do it its great", if they have not print "You should think about it"
    Ask the user their favorite animal?
        Print "Wow %animal is a great animal"
    Ask the user how many pets they want?
        Print "Interesting, do you want %numberOfPets %favoriteAnimals?"


 */

public class AllOfYourPersonalInformation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with");
        byte liveWithNumber = input.nextByte();

        if (liveWithNumber > 0 && liveWithNumber <= 12) {

            if (liveWithNumber <= 2) { // only be 1 or 2
                System.out.println("Live with less than 2 people");
            } else if(liveWithNumber < 7) { // include 3 - 6
                System.out.println("Live with 3-6 people");
            } else { // include 7 - 12
                System.out.println("You will with more than 6 people");
            }

        } else {
            System.err.println("Not a valid number of people");
        }

        System.out.println("What city do you live in");
        input.nextLine();
        String city = input.nextLine();

        System.out.println("Do you live in downtown");
        String liveDownTown = input.next();
        if(liveDownTown.equalsIgnoreCase("yes")) {
            System.out.println("Have you thought about moving to the suburbs");
            String suburb = input.next();
            if(suburb.equalsIgnoreCase("yes")) {
                System.out.println("You should its great");
            } else {
                System.out.println("You should think about it");
            }
        }

        System.out.println("what is your favorite animal");
        String animal = input.next();
        System.out.println("Wow, " + animal + " is a great animal");

        System.out.println("How many pets do you want");
        int pets = input.nextInt();
        System.out.println("Interesting, do you want " + pets + " " + animal + "s" );

    }
}
