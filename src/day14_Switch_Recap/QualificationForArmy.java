package day14_Switch_Recap;

public class QualificationForArmy {

    public static void main(String[] args) {

        String citizen = "Turkey";
        boolean isResident = true;
        boolean isAlien = false;

        boolean hasHighSchoolDiploma = true;

        int age = 18;

        int numberOfDependants = 3;

        if( citizen == "USA" || isResident || isAlien ){

            if(age >= 17 && age <= 34){

                if(hasHighSchoolDiploma){

                    if( numberOfDependants<= 2) {
                        System.out.println("You are qualified for the US Army");
                    }else{
                        System.err.println("You must have no more than two dependents.");
                    }

                }else{
                    System.err.println("You must have a high school diploma");
                }

            }else{
                System.err.println("Your age must be between 17 to 34 years old");
            }

        }else{
            System.err.println("You must be a U.S. citizen or a resident  or alien");
        }




    }

}

/*
2. What are the qualifications to join the Army?
			You must be a U.S. citizen or a resident alien.
			Be between the ages of 17-34. ...
			Have a high school diploma.
			Have no more than two dependents.
 */
