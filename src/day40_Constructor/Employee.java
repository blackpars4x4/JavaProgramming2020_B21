package day40_Constructor;

public class Employee {
    public String name, jobTitle, ID;
    public double salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }
    public Employee(String name,String jobTitle, String ID){
        this(name, jobTitle);
        this.ID = ID;
    }
    public Employee(String name,String jobTitle, String ID, double salary){
        this(name, jobTitle, ID);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                '}';
    }
}
