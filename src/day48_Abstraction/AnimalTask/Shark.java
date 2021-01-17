package day48_Abstraction.AnimalTask;

public final class Shark extends Animal implements Predator, Swimable {
    public Shark(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Shark sleeps 0 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Shark hunts fish");
    }

    @Override
    public void swim() {
        System.out.println("Shar can swim 20 hours");
    }
}