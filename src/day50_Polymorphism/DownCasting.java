package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;
import day43_Inheritance.CarTask.BMW;
import day43_Inheritance.CarTask.Car;
import day43_Inheritance.CarTask.Toyota;
import day45_Exceptions.PhoneTask.Iphone;
import day45_Exceptions.PhoneTask.Phone;
import day45_Exceptions.PhoneTask.Samsung;
import day49_Abstraction.ShapeTask.RemoteDriveTask.*;
import day49_Abstraction.ShapeTask.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.ShapeTask.Cylinder;
import day49_Abstraction.ShapeTask.ShapeTask.Shape;

public class DownCasting {
    public static void main(String[] args) {
        Shape shape = new Cylinder(3, 5);
       //  Cylinder cylinder = (Cylinder) shape;
      //  System.out.println( cylinder.volume()  );


       double volume =  ((Cylinder) shape).volume();

        System.out.println(volume);

        System.out.println("=================================");

        Animal animal = new Cat("Lucy", "Husky", 'M',12, "White", "Small");
       // ( (Dog)animal ) .bark();

        Car car = new Toyota("Camry", "White", 2020, 45000, 35000);
      //  ((BMW)car).race();

        System.out.println("=======================================");

        Phone phone = new Samsung("S20", 2000);
       // ((Iphone)phone).faceTime(123456);

        System.out.println("=======================================");
        WebDriver driver = new ChromeDriver();
        ( (TakeScreenShot)driver ).TakeScreenShot("pic");
        ( (JavaScriptExecuter)driver).executeScript("");


        System.out.println("===================================");
        Shape shape2 = new Circle(3);
        ( (Cube)shape2 ).volume();

        System.out.println("===================================");
        ((TakeScreenShot) driver).TakeScreenShot("");
        ((JavaScriptExecuter) driver).executeScript("");


         RemoteDriver dr1 =new FireFoxDriver(); // up casting
         JavaScriptExecuter js = new FireFoxDriver();
         TakeScreenShot ts = new FireFoxDriver();


        System.out.println("=======================================");
       boolean isChrome = driver instanceof ChromeDriver;

       // Assert.assertTrue(isChrome);



    }
}
