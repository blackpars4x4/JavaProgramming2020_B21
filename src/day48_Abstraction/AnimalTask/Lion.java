package day48_Abstraction.AnimalTask;

public class Lion extends Animal implements Predator{
    public Lion(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Lion Sleeps 10 hours");

    }

    @Override
    public void hunt() {
        System.out.println("Lion hunts deer");
    }
}
