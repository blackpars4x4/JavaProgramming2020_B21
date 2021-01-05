package library;

import day43_Inheritance.PersonTask.Employee;

public class BA extends Employee {

    public static void main(String[] args) {
        System.out.println(BA.publicVariable);
        System.out.println(BA.protectedVariable);
        //     System.out.println(BA.defaultVariable);


    }

}


class A{

    public static void main(String[] args) {
        System.out.println(Employee.publicVariable );
        //   System.out.println(Employee.protectedVariable);
        // protected: outside the package, only visible to the sub classes
        // default: outside the package, never
        // public: ALWAYS

    }

}