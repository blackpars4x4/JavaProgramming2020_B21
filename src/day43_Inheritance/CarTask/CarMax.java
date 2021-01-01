package day43_Inheritance.CarTask;

public class CarMax {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "Blue", 2019, 235000, 10000);

        BMW bmw = new BMW("X5", "Red", 2018, 15000, 50000);

        System.out.println(toyota);
        System.out.println(bmw);

        // System.out.println( BMW.isMortal);
        System.out.println(BMW.isExpensive);
        System.out.println(BMW.isLuxury);

        // System.out.println(Toyota.isLuxury);
        // System.out.println(Toyota.isExpensive);

        System.out.println(Toyota.isAfordable);
        System.out.println(Toyota.isImmortal);


    }
}
