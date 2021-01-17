package day48_Abstraction.AnimalTask;

public abstract class Animal {

    public String name, breed, size;
    public char gender;
    public int age;

    public Animal(String name, String breed, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public abstract void sleep();


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
