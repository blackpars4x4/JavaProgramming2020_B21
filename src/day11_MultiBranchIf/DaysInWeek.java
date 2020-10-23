package day11_MultiBranchIf;

public class DaysInWeek {

    public static void main(String[] args) {
        int number = 6; // 1 ~ 7
        String day = "";

        if( number == 1){
            day = "Monday";
        }else if(number == 2){
            day = "Tuesday";
        }else if(number == 3){
            day = "Wednesday";
        }else if(number == 4){
            day = "Thursday";
        }else if(number == 5){
            day = "Friday";
        }else if(number == 6){
            day = "Saturday";
        }else  {
            day = "Sunday";
        }

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
 */
