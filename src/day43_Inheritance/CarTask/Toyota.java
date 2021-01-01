package day43_Inheritance.CarTask;

public class Toyota extends Car {

    /*
    variables: brand, model, color, madeIn, year, miles, price
    methods: setInfo, drive, park, toString
     */

    public Toyota( String model, String color, int year, int miles, double price) {
        setInfo("Toyota", model, color, "Japan", year, miles, price);
    }

    public static boolean isAfordable, isImmortal;

    static {
        isAfordable =true;
        isImmortal = true;
    }


}


//	isAfordable, isImmortal
