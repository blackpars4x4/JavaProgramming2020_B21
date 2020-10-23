package day13_SwitchStatement;

public class DaysInMonth {

    public static void main(String[] args) {
        int year = 2021;
        int month = 25; // 1 ~ 12

        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        //   boolean has31Days = !has28Or29Days || !has30Days;

        String result = "";

        if (month > 0 && month < 13) { // 1 ~ 12, if the mopnth is valid

            if (month == 2) { // for Feb

                if (year % 4 == 0) { // leap year
                    result = "29 days";
                } else { // not leap year
                    result = "28 days";
                }

            } else if (has30Days) { // for April, June, September, November
                result = "30 days";
            } else { // for Jan, Mar, May, Jul, Aug, Oct, Dec
                result = "31 days";
            }

        } else { // if the month is invalid
            result = "Invalid Month";
        }


        System.out.println(result);


    }

}

/*
1. write a program that can find the number of days in a month
            		Note: MUST USE NESTED IF
 */