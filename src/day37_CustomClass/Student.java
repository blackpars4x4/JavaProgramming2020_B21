package day37_CustomClass;

import java.time.LocalDate;

public class Student {
    public String name, ID;
    public LocalDate DOFB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo(String name, char gender, LocalDate DOFB, String ID, double gpa) {
        this.name = name;
        this.gender = gender;
        this.DOFB = DOFB;
        age = LocalDate.now().getYear() - DOFB.getYear();
        this.ID = ID;
        this.gpa = gpa;
    }

    /*public void getInfo(){
        System.out.println("Student name : " + name + "\nStudent ID   : " + ID + "\ngpa: " + gpa + "\nAge: " + age + "\nGender: " + gender);
    }*/

    /*public String toString(){
        return "Name: " +name+", Gender: "+gender+", ID: "+ID+", Date of Birth: "+DOFB+", GPA: "+gpa;
    }*/

    @Override
    public String toString() {
        return
                "name=" + name +
                ", ID=" + ID +
                ", Date of Birth=" + DOFB +
                ", age=" + age +
                ", gender=" + gender +
                ", gpa=" + gpa;
    }
}
/*
1. Student:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
 */
