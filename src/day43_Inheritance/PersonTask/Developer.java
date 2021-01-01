package day43_Inheritance.PersonTask;

public class Developer extends Employee { // Developer IS A Person. Developer IS A Employee
    /*
    Inherited:
         Variables: name, age, gender, hourlyRate, jobTitle, ID
         methods: setInfo, setInfo, eat(), sleep(), work()
     */
    public Developer(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void coding(){
        System.out.println(jobTitle+" "+name+" is coding");
    }



}

/*
 name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), code()...
 */