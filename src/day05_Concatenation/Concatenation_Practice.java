package day05_Concatenation;

public class Concatenation_Practice {

    public static void main(String[] args) {

            int houseNumber = 11822;
            String streetName = "Federalist Way";
            String cityName ="Fairfax";
            String state = "VA";
            int zipCode = 20302;

            String fullAddress = houseNumber+ " "+ streetName+"\n"  + cityName+" " + state+", " +zipCode;

        System.out.println(fullAddress);

        System.out.println("=============================================");

        String brand = "BMW";
        String model = "X7";
        int year = 2012;
        short mileage = 20000;
        double price = 45000;
        String color = "Red";

        // 2010 Toyota Camry, 55000 miles, Red, $18000
        String carInfo = year+" "+brand+" "+model+", "+mileage+" miles, "+color+", $"+price; // concatenation

        System.out.println( carInfo );


    }

}
