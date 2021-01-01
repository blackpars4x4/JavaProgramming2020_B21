package day43_Inheritance.PersonTask;

public class AppleInc { // AppleInc HAS A Tester
    // Apple HAS A Developer

    public static void main(String[] args) {

        Tester tester1 = new Tester("Necdet",24,'F', 45, "SDET", "A124");;
        tester1.eat();
        tester1.sleep();
        tester1.work();
        System.out.println("Salary: "+ tester1.calcSalary());
        tester1.testing();

        System.out.println(tester1);

        Developer developer1 = new Developer("Mini",24,'F', 45, "Senior Developer", "A124");
        developer1.eat();
        developer1.sleep();
        developer1.work();
        developer1.coding();
        System.out.println("Salary: "+developer1.calcSalary());
        System.out.println(developer1);



    }

}
