package day09_IfStatement;

public class EligibleToVote2 {

    public static void main(String[] args) {
        String name = "Jimmy";
        boolean isUSCitizen = false;
        int age = 25;
        boolean hasCriminalBackground = false;

        boolean isEligible =   isUSCitizen == true  &&  age >= 18 && hasCriminalBackground == false ;
           //                    false == true  &&  25 >= 18  &&  false == false
        //                         false && true && true
        //                          false

        System.out.println(name+" is eligible to vote: "+isEligible);

        String name2 = "John";
        String c1 = "China";
        String c2 = "Canada";

        boolean eligible =  c1 == "USA"   ||   c2 == "USA";
        //                 "China" == "USA" || "Canada" == "USA"
        //                      false || false
        //                      false



        System.out.println(name2+" is eligible to vote: "+eligible);


    }

}
