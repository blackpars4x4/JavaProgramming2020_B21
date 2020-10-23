package day14_Switch_Recap;

public class DaysInMonths2 {

    public static void main(String[] args) {
        int year = 2021;
        String month = "Feb";

        String result = "";

        switch (month){
            case "Feb": result = (year%4 ==0)? "29 days" : "28 days";
                        break;

            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov": result = "30 days"; // this is the or logic in switch statement
                        break;

            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec": result = "31 days";
                        break;

            default: result = "Invalid";

        }

        System.out.println(result);



    }
}

/*
cases: 2 ==> 28 or 29 days
cases: 4,6,9,11 ==> 30 days
cases: 1, 3, 5, 7, 8, 10, 12 ==> 31 days

 */