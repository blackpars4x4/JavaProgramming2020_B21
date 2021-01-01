package Day44_InheritancePractice.CarTask;

public class Tesla extends Car{


    public Tesla( String model, String color, double price, int year) {
        super("Tesla", model, color, price, year);
    }

    @Override
    public void start() {
        System.out.println("Say \"start\" ");
    }

}
