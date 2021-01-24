package day47_Abstraction.EmployeeTask;

public class AppleInc { // Has A

    public static void main(String[] args) {
      //  Person person = new Person("Person A", 28, 'M'); // cannot create object from abstract class
      // Employee employee = new Employee("John", 34, 'M', "QE", "A01", 100000);
       // cannot create object from abstract class

        Tester tester = new Tester("Mini", 23, 'F',"SDET","S123", 95_000);
        Developer developer = new Developer("Emre",30,'M',"Java Developer","784512",110000);
        UberDriver uberDriver = new UberDriver("Mahmood", 54,'M',"Driver", "UBR123", 75000);

        tester.work();
        tester.sleep();

        developer.work();
        developer.sleep();

        uberDriver.work();
        uberDriver.sleep();

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(uberDriver);



    }

}
