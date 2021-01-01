package day43_Inheritance.PersonTask;

public class Tester extends  Employee { // Tester IS A person,  Tester IS An Employee
/*
inherited:
    variables: name, age, gender, hourlyRate, jobTitle, ID
    methods: work, setInfo, setInfo, toString, eat, sleep
 */

    public Tester(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void testing(){
        System.out.println(jobTitle+" "+name+" is testing");
    }

}

/*
 name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), testing(),...
 */