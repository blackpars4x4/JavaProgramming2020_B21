package day12_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {
        int number = 5 ;
        String day = "";

        if(number>=1 && number<= 7){

            if(number ==1){
                day = "Monday";
            }else if(number == 2){
                day = "Tuesday";
            }else if(number == 3){
                day = "Wednesday";
            }else if(number == 4){
                day ="Thursday";
            }else if(number == 5){
                day = "Friday";
            }else if(number == 6){
                day = "Saturday";
            }else{
                day = "Sunday";
            }

        }else{
            day = "No Such a Day";
        }

        System.out.println(day);

    }

}
