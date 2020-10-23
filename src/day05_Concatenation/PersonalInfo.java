package day05_Concatenation;

public class PersonalInfo {

    public static void main(String[] args) {
        String firstName = "Cybertek";
        String lastName = "School";
        String fullName = firstName+" "+lastName;
        int age = 6;
        String gender = "Male";
        int phoneNumber = 789456123;
        int SSN = 456789123;

        System.out.println("Full Name is: "+ fullName );
        System.out.println("Age is: " + age + " years old" );
        System.out.println("Gender is: " + gender );
        System.out.println("Phone number: " + phoneNumber );
        System.out.println("SSN: " +SSN);


    }

}


/*
variables: firstName, lastName, fullName, age, gender, phoneNumber, SSN
	output:
			full name is: YourFullName
			age is: YourAge years old
			gender is: YourGender
			Phone Number is: YourPhoneNumber
			SSN is: YourSSN

			please use concatenation, do not use more than 5 print statements
 */