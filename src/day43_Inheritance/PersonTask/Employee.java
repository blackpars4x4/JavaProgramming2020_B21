package day43_Inheritance.PersonTask;

public class Employee extends Person {  // Employee IS A Person
    /*
    inherited:
        variables: name, age, gender
        methods: setInfo, eat, sleep, toString
     */
    public double hourlyRate;
    public String jobTitle, ID;

    public void work(){
        System.out.println(name+" is working");
    }

    public void setInfo(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.ID = ID;
        this.jobTitle = jobTitle;
    }

    public double calcSalary(){
        return hourlyRate * 40 * 52 ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name= '" + name + '\'' +
                ", age=" + age +
                ", jobTitle= '" + jobTitle + '\'' +
                ", hourlyRate= $" + hourlyRate +
                ", ID=' " + ID + '\'' +
                ", gender= " + gender +
                ", salary= $" + (int)calcSalary() +
                '}';
    }


    public static String publicVariable = "Public";
    protected static String protectedVariable = "Protected";
    static String defaultVariable = "default";


}

/*
 name, age, gender, hourlyRate, jobTitle, ID
        setInfo, eat(), sleep(), work()
 */
