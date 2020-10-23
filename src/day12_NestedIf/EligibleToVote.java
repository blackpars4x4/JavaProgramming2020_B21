package day12_NestedIf;

public class EligibleToVote {

    public static void main(String[] args) {

        String citizen = "USA";
        int age = 40;

        if(citizen == "USA"){

            if(age >= 18){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You must be at least 18 years old to vote");
            }

        }else{
            System.out.println("You must be US citizen in order to vote");
        }




    }

}
