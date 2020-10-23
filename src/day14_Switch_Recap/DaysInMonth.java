package day14_Switch_Recap;

public class DaysInMonth {

    public static void main(String[] args) {
        int year = 2020;
        String month = "Aug";

        String result = "";

        switch (month){
            case "Jan": result = "31 days";
                        break;

            case "Feb":  result = (year%4 == 0)? "29 days" : "28 days";
                        break;

            case "Mar": result = "31 days";
                        break;

            case "Apr": result = "30 days";
                        break;

            case "May": result = "31 days";
                        break;

            case "Jun": result = "30 days";
                        break;

            case "Jul": result = "31 days";
                        break;

            case "Aug": result = "31 days";
                        break;

            case "Sep": result = "30 days";
                        break;

            case "Oct": result = "31 days";
                        break;

            case "Nov": result = "30 days";
                        break;

            case "Dec": result = "31 days";
                        break;

            default: result = "Invalid";  // last block does not need break statement

        }

        System.out.println(result);



    }

}

/*
1. use switch statement to write a program that can return the number of days based on the name of the month

	Ex:
		year = 2020;
		month = Mar;

		output:
			31 days


		year = 2020;
		month = Feb;

		output:
			29  days
 */
