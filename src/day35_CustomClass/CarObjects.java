package day35_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "Toyota";
        car2.brand = "BMW";   // second copy
        car3.brand = "Lexus";  // third copy

        System.out.println( car1.brand );
        System.out.println( car2.brand);
        System.out.println( car3.brand);

        car1.model = "Corolla";
        car2.model = "i8";
        car3.model = "RX";

        System.out.println(car1.model);
        System.out.println(car2.model);
        System.out.println(car3.model);


        Car car4 = new Car();
        car4.setInfo("Mercedes", "C300", "Red", 2018, 10000);

        System.out.println(car4.brand);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.year);

        // 2018 Mercedes C300 Red

        System.out.println(  car4.year +" "+car4.brand +" " +car4.model+" "+car4.color );


/*
        String str1 = "Toyota";
        String str2 = "BMW";
        String str3 = "Lexus";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
*/





    }
}
