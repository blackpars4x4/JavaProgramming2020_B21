package day29_Methods;

public class MethodsWithParameter {

    public static void main(String[] args) {

        int age = 35;

        eligibleToBuyAlcohol(age);

        eligibleToBuyAlcohol(30);
        calculateAge(2018, 2015);
        calculateAge(1965, 2020);
        calculateAge(1976, 2020);
    }

    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not ELigible to buy alcohol");
        }


    }


    public static void calculateAge(int birthYear, int currentYear) {
        if (birthYear < currentYear) {
            System.out.println("Your age is: " + (currentYear - birthYear) + " years old");
        }

    }
}