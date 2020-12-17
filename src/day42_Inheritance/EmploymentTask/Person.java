package day42_Inheritance.EmploymentTask;

public class Person {
    public String name;
    public int age;
    public char gender;

    public void setInfo(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name + " is eating vegetarian food");
    }
    public void sleep(){
        if(age >= 18){
            System.out.println( name + " is an adult and should sleep 7-9 hours a day. ");
        }else{
            System.out.println(name + " is a younger should sleep 9 hours");
        }
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
