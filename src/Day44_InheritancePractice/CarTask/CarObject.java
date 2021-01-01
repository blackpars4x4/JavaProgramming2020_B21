package Day44_InheritancePractice.CarTask;

public class CarObject {
    public static void main(String[] args) {
        Honda honda = new Honda("Civic", "Red", 23000, 2019);

        honda.start();
        System.out.println(honda);

        Mercedes mercedes = new Mercedes("E320", "Red", 23000, 2019);
        mercedes.start();

        System.out.println(mercedes);

        Jeep jeep = new Jeep("Cherokee", "Red", 23000, 2019);
        jeep.start();
        System.out.println(jeep);

        Tesla tesla = new Tesla("Model Y", "Red", 23000, 2019);
        tesla.start();
        System.out.println(tesla);


    }
}
