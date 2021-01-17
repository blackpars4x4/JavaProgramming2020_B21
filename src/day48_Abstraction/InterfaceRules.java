package day48_Abstraction;

public interface InterfaceRules {
    int a = 100; // it is not instance variable !!! by default static variable

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceRules.a);
    }
}

/*
Inteface: cannot have objects
what we can have:
        variables: public static



what we cannot have:
        constructor
        intstance method
        instance varibles
 */
