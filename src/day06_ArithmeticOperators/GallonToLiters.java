package day06_ArithmeticOperators;

public class GallonToLiters {

    public static void main(String[] args) {
        double gallon = 55;
        double liters = gallon * 3.78541;

        System.out.println(gallon+" gallons equal to " + liters+" L." );

        boolean  exceeded300Liters = liters > 300;
                                // the liters exceeds 300

        // 120.5 gallons exceeds 300 liters: true/false
        System.out.println(gallon +" gallons exceeds 300 liters: " + exceeded300Liters );

    }

}


/*
Task02:
        create a class called GalonsToLiters, and write a program that can convert the gallons tto litters
            Ex:
                galon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                galon = 20
                 output:
                    20 gallons equal to 75.7082 liters

            Hint: 1 gallon = 3.78541 liters
 */