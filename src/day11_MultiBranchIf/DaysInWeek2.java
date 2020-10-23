package day11_MultiBranchIf;

public class DaysInWeek2 {

    public static void main(String[] args) {

        int n = 7;
        String day = (n==1)? "Monday" :(n==2)?"Tuesday" :(n==3)?"Wednesday" :(n==4)?"Thursday"
                     :(n==5)? "Friday" :(n==6)? "Saturday" : "Sunday";

        System.out.println(day);

    }

}



/*
1. write program that can print out the name of the day based on the number 1 ~ 7
		 number = 1  // 1 ~ 7
		 output:
		 	Monday

	 	number = 5
	 	output:
		 	Friday

            MUST use ternary

 */