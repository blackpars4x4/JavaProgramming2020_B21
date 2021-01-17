package day48_Abstraction.AnimalTask;

public final class Dog extends Animal implements Playable, Swimable {
    public Dog(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps 8 hours");
    }


    @Override
    public void play() {
        System.out.println("Dog plays with with ball");
    }

    @Override
    public void swim() {
        System.out.println("Dog can swim 10 minutes");
    }
}
