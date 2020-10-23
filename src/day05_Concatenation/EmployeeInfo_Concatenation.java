package day05_Concatenation;

public class EmployeeInfo_Concatenation {

    public static void main(String[] args) {
        String firstName = "Yasin"; //"" for the texts
        String lastName = "Seyhan";
        String fullName =   firstName+" "+lastName; // string ==> text
        char gender = 'M'; // '' for single character
        int age = 30;
        String companyName = "Bank Of America";
        String jobTitle = "Software Developer";
        double salary = 150000; //120000.0
        boolean isFullTime = false;
        boolean isMarried = true;

        System.out.println("Employee's full name is: "+fullName);
        System.out.println(fullName +"'s gender is: "+gender );
        System.out.println(fullName+"'s age is: "+age+" years old");
        System.out.println(fullName+" works at: "  + companyName  );
        System.out.println(fullName+"'s job title is: "+jobTitle );
        System.out.println( fullName+ "'s salary is: $ "  +  salary);


    }


}

/*
     output:
                Employee' full name is: John Daniel
                John Daniel' gender is: M
                John Daniel' age is: 35 years old
                John Daniel works at: CapitalOne
                John Daniel' Job title is: SDET
                John Daniel' salary is 120000.5 $
                John Daniel is full time employee: true
                John Daniel is married: false
 */