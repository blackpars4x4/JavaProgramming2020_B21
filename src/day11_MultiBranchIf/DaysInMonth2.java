package day11_MultiBranchIf;

public class DaysInMonth2 {

    public static void main(String[] args) {
        int month = 11; // 1 to 12

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month ==11;

        int days = 0 ;
        if(has28Days){
            days = 28;
        }else if(has30Days){
            days = 30;
        }else{
            days = 31;
        }

        System.out.println(days+" days");

        System.out.println("=================================================");

        int days2 = (has28Days)? 28 :(has30Days)?  30 : 31;

        System.out.println(days2+" days");



    }

}
