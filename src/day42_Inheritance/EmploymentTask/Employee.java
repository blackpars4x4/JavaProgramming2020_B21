package day42_Inheritance.EmploymentTask;

public class Employee extends Person {
    public String name, jobTitle, ID;
    public int age, hourlyRate;
    public char gender;

    public void setInfo(String name, String jobTitle, String ID, int age, int hourlyRate, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.gender = gender;
    }





}
