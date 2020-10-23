package day11_MultiBranchIf;

public class GradeReport {

    public static void main(String[] args) {
        int score = 90; // 0 ~ 100

        String result = "";

       if (score < 60 ){
            result = "Failed";
       } else if( score >= 60 && score < 90){
           result = "Passed";
       }else{ // score >= 90
           result = "Passed with distinction";
       }


        System.out.println(result);




    }

}
