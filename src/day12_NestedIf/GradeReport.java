package day12_NestedIf;

public class GradeReport {

    public static void main(String[] args) {
        int score = 78;
        String grade = "";

        if(score>=0 && score <= 100){ // for valid score

            grade = (score>=90) ? "A" :(score >=80) ? "B" :(score>=70)? "C"
                    :(score>= 60)? "D" : "F";

        }else{
            grade = "Invalid";
        }


        System.out.println(grade);




    }

}
