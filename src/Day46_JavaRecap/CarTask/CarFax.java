package Day46_JavaRecap.CarTask;

public class CarFax {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("C Class", "Red", 2020, 300000);
        Lexus lexus = new Lexus("RX 350", "White", 2010, 20000);
        BMW bmw = new BMW("X6", "Black", 2019, 45000);
        Tesla tesla = new Tesla("Model 3", "Blue", 2020, 50000);

        mercedes.start();
        lexus.start();
        bmw.start();
        tesla.start();

        System.out.println("=========================================================");

        mercedes.drive();
        bmw.drive();
        lexus.drive();
        tesla.drive();

        System.out.println("=========================================================");

        tesla.autoPilot();


    }
}
