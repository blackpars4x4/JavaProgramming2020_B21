package day42_Inheritance.AnimalTask;

import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Tiger;

public class Zoo {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan", "bengal tiger", 'M', 5, "Orange", "large");

        System.out.println(tiger);
        tiger.eat("Chicken");
        // tiger.meow();
        tiger.hunt();
        tiger.roar();

        Cat cat = new Cat("Kitty", "British Fold", 'F', 1, "White", "small");

        System.out.println(cat);

        cat.eat("Tuna");
        cat.drink("Milk");
        cat.sleep();
        cat.meow();

        Dog dog = new Dog("Nina","American bull dog",'F',2,"White and brown","Big");

        System.out.println(dog);
        dog.eat("chicken");
        dog.drink("water");
        dog.sleep();
        dog.bark();


    }
}
