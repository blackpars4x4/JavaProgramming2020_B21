package day48_Abstraction.AnimalTask;

public class Eagle extends Animal implements Predator {
    public Eagle(String name, String breed, String size, char gender, int age) {
        super(name, breed, size, gender, age);
    }


    @Override
    public void sleep() {

    }
    @Override
    public void hunt() {

    }

}
