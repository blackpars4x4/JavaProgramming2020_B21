package day47_Abstraction.EmployeeTask;

public final class Developer extends Employee {
    public Developer(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    public void work() {
        System.out.println("Developer is writing codes");
    }

    @Override
    public void sleep() {
        System.out.println("Developers usually sleep 6 hours");
    }


}
