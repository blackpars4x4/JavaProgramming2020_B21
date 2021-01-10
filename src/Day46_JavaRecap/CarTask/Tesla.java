package Day46_JavaRecap.CarTask;

public class Tesla extends Car{


    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }
    public void start() {
        System.out.println("Starting "+brand+" "+model+" by voice control");
    }

    public void autoPilot(){
        System.out.println("Self driving "+brand+" "+model);
    }


}
