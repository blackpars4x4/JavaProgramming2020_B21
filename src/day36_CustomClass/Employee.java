package day36_CustomClass;

import java.time.LocalDate;

public class Employee {

    public String name, jobTitle, ID, companyName ;
    public double salary;
    public LocalDate hireDate;
    public char gender;

    public void setInfo(String name, char gender, String jobTitle, String companyName, double salary, String ID, LocalDate hireDate ){
        this.name = name;  // instance = local
        this.gender = gender;
        this.jobTitle =jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.ID = ID;
        this.hireDate = hireDate;
    }

    public void getInfo(){
        System.out.println("Name: "+name+", Gender: "+gender+", ID: "+ID+", Company Name: "+companyName
                +", Job Title: "+jobTitle+", salary: "+salary+", Hired: "+hireDate);
    }

    public void working(){
        System.out.println( name+" is working");
    }

    public void meeting(){
        System.out.println(name+" is in a meeting");
    }
}
