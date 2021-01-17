package day47_Abstraction.CarTask;

public class BMW  extends Car{

    public BMW(String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("call mechanic: oil change, jump start, ask your frinds to push");
    }
}
