package day09_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "Jimmy";
        String citizen = "Korea";

        boolean eligible =   citizen== "USA" ;

        System.out.println(name +" is eligible to vote for Donald Trump or Joe Biden?\n\t"+eligible);

        System.out.println("=======================================================================");

        String name2 = "Jimmy";
        boolean isUSCitizen = false; //

        boolean eligibleToVote =     isUSCitizen == true;
        //                            false  ==  true
        //                                  false

        System.out.println(name2 +" is eligible to vote for Donald Trump or Joe Biden?\n\t"+eligibleToVote);

    }

}

/*
2. write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"

            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true

 */