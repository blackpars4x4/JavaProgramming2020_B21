package day35_CustomClass;

import java.time.LocalDate;

public class Dog {

    public String nickName;
    public String breed;
    public String size;
    public char gender;
    public String color;
    public LocalDate DOB;
    public int age;

    // sets the instance variables of dog objects
    public void setInfo(String dogNickName, String dogBreed, String dogSize, char dogGender, String dogColor, LocalDate dogDOB){
        nickName = dogNickName;
        breed = dogBreed;
        size = dogSize;
        gender = dogGender;
        color = dogColor;
        DOB = dogDOB;
        age = LocalDate.now().getYear() - DOB.getYear();
        //  age   = current year  - bith year
    }

    // to print the info of the dog objects
    public void getInfo(){
        System.out.println("Name: "+nickName+", Breed: "+breed+", Gender: "+gender+", Color: "+color
                +", Size: "+size+", Age: "+  age );
    }

    public void eat(String food){
        System.out.println(nickName +" is eating "+food);
    }

    public void drink(String drink) {
        System.out.println(nickName+" is drinking "+drink);
    }

}



