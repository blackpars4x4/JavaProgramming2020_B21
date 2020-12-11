package day38_Statics.ScrumTask;

public class Tester {

    public String name, ID, jobTitle, companyName;
    public double salary;
    public char gender;

    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting(){
        System.out.println(name+" is performing smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }

}

/*
create a class called Tester
					Attributes:
						name, employeeID, JobTitle, Salary
					Actions:
						setInfo(), smokeTesting(),  creatingTicket(), toString()
 */