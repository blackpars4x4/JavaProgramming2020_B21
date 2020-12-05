package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchool {

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();
        Student student9 = new Student();
        Student student10 = new Student();

        student1.setInfo("Aaron", 'M', LocalDate.of(2000,11,2), "A01", 1.5);
        student2.setInfo("Daniel", 'M', LocalDate.of(1990, 10, 25), "B123", 3.2);
        student3.setInfo("Vanya", 'M', LocalDate.of(1998, 10, 12), "C324", 3.3);
        student4.setInfo("Jessica", 'F', LocalDate.of(1999, 8,19), "G345", 5.3);
        student5.setInfo("Jennifer", 'F', LocalDate.of(1990, 12,13), "F435", 2.3);
        student6.setInfo("Kostya", 'M', LocalDate.of(2000, 9,7), "J09", 2.5);
        student7.setInfo("Adel", 'F', LocalDate.of(1999, 1,20), "L092", 6.5);
        student8.setInfo("Bob", 'M', LocalDate.of(1989, 6,29), "Y45", 1.3);
        student9.setInfo("John", 'M', LocalDate.of(2001, 7,12), "L05", 1.3);
        student10.setInfo("Sanya", 'M', LocalDate.of(1990, 3,29), "P93", 3.9);

        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8,student9,student10));

        Student student11 = new Student();
        student11.setInfo("Mike", 'F', LocalDate.of(1990, 9, 6), "M562", 2.8);
        Student student12 = new Student();
        student12.setInfo("Lily", 'F', LocalDate.of(1997, 12, 12), "L093", 4.4);

        System.out.println(students);

        students.addAll(Arrays.asList(student11,student12));
        System.out.println(students);

        System.out.println("================================================");

        // for finding the youngest && oldest student
        LocalDate youngest = students.get(0).DOFB; // 1998
        LocalDate oldest = students.get(0).DOFB;

        Student youngestStudent = null ;  // null: is default value of all non primitives
        Student oldestStudent = null;

        for(Student each : students){
            if( each.DOFB.isAfter(youngest)  ){  // whichgever students Date of bith is after the current youngest student's date of both
                youngest = each.DOFB;
                youngestStudent = each;
            }

            if( each.DOFB.isBefore(oldest)  ){
                oldest =  each.DOFB;
                oldestStudent = each;
            }


        }

        System.out.println(youngest);
        System.out.println(youngestStudent);

        System.out.println(oldest);
        System.out.println(oldestStudent);

        System.out.println("=========================================================================");
        // find highest gpa and lowest gpa
        double highestGPA = students.get(0).gpa;
        double lowestGPA = students.get(0).gpa;

        for (Student eachStudent : students){
            double eachGPA = eachStudent.gpa;
            highestGPA =Math.max(eachGPA, highestGPA);
            lowestGPA  = Math.min(eachGPA, lowestGPA);

        }


        System.out.println("Highest GPA: "+highestGPA);
        System.out.println("Lowest GPA: "+lowestGPA);

        System.out.println("=================================================================");

        ArrayList<Student> femaleStudents = new ArrayList<>(students);
        femaleStudents.removeIf( p ->  p.gender == 'M'  ); // removes the students from femaleStudents list if the student is Male

        System.out.println(femaleStudents);

        ArrayList<Student> maleStudents = new ArrayList<>(students);
        maleStudents.removeIf( p -> p.gender =='F');

        System.out.println(maleStudents);


        System.out.println("Total number of male students: "+maleStudents.size());
        System.out.println("Total Number of female students: "+femaleStudents.size());


    }


}
