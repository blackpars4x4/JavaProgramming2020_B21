package day41_Enclapsulation;

public class PersonObject {

    public static void main(String[] args) {
        Person p1 = new Person("Jimmy", 19, 'M');

        // System.out.println(p1.name);
        System.out.println(p1.getName());

        p1.setName("Breanna");
        p1.setAge(23);
        p1.setGender('F');

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());





    }
}
