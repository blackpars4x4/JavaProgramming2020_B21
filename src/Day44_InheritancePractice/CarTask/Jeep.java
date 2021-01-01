package Day44_InheritancePractice.CarTask;

public class Jeep extends Car {


    public Jeep( String model, String color, double price, int year) {
        super("Jeep", model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Call Mechanic, oil change, jump start");
    }


}
