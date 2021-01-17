package day48_Abstraction.AnimalTask;

public final class Parrot extends Animal implements Flyable, Playable{


    public Parrot(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Parrot sleeps 4 hours");
    }

    @Override
    public void fly() {
        System.out.println("Parrot can fly 1 hour");
    }

    @Override
    public void play() {
        System.out.println("Parrot talks with human");
    }


}