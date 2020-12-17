package day42_Inheritance.AnimalTask;

import day42_Inheritance.AnimalTask.Animal;

public class Tiger extends Animal {

    public Tiger(String name, String breed, char gender, int age, String color, String size) {
        setInfo(name, breed, gender, age, color, size);
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }

    public void roar() {
        System.out.println(name + "is roaring");
    }
}
