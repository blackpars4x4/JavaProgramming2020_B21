package day50_Polymorphism;

import day49_Abstraction.RemoteDriverTask.ChromeDriver;
import day49_Abstraction.RemoteDriverTask.CybertekDriver;
import day49_Abstraction.RemoteDriverTask.FireFoxDriver;
import day49_Abstraction.RemoteDriverTask.WebDriver;
import day49_Abstraction.ShapeTask.Circle;
import day49_Abstraction.ShapeTask.Cube;
import day49_Abstraction.ShapeTask.Rectangle;
import day49_Abstraction.ShapeTask.Shape;
import day50_Polymorphism.PhoneTask.IPhone;
import day50_Polymorphism.PhoneTask.Phone;
import day50_Polymorphism.PhoneTask.Samsung;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismIntro {

    public static void main(String[] args) {

      //  IPhone iphone1 = new IPhone("IPhone 12",  "Small", "Black", 1000);

      //  Samsung samsung1 = new Samsung("Galaxy S20", "Medium", "White", 900);

        Phone phone1  = new Samsung("Galaxy S21", "Medium", "White", 1100);

        Phone phone2 = new IPhone("IPhone 12",  "Small", "Black", 1000);

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add( new IPhone("IPhone 11",  "Small", "Black", 1000));
        phones.add( new Samsung("Galxy 19", "Medium", "White", 1100));

       // List<Integer> list = new ArrayList<>();

        Shape shape;

      //  shape = new Circle(3);
      //  shape = new Rectangle(3,4);
        shape = new Cube(5);

        System.out.println(shape.area());


        System.out.println("=============================");
        String browserName = "chrome";

       WebDriver driver;

       switch (browserName){
           case "firefox":
                driver = new FireFoxDriver();
                break;

           case "chrome":
               driver = new ChromeDriver();
               break;

           case "cybertek":
               driver = new CybertekDriver();
               break;

           default:
               throw new RuntimeException("Invalid browser Name");
       }












    }

}
