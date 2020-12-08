package OfficeHours.Practice_11_25_2020;

public class MethodPractice {
    public static void main(String[] args) {
        divisibleBy3Between1To100();
        System.out.println("Hello");

        divisibleBy3Between1To100();
        System.out.println("How are you");

        divisibleBy3(100, 10);

        //    grade(5.5);
        grade(85);

        eligibleToVote(25, false);

    }

    public static void divisibleBy3Between1To100() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {//if the number is not divisible by 3 skip(continue)
                continue; //then skip...
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void divisibleBy3(int start, int end) {

        if (end <= start) {
            System.out.println("Invalid Numbers");
            /*System.exit(0);*/
            return; // exits the current method
        }
        for (int i = start; i <= end; i++) {
            if (i % 3 != 0) {  // if the number is not divisible by3
                continue; // then skip
            }
            System.out.print(i + " ");
        }

        System.out.println();
    }

      /*
    A: Excellent
    B: Great
    C: Good
    D: Passed
    F: Failed
     */

    public static void grade(int score) {
        if (score < 0 || score > 100) {  // if score is invalid
            System.out.println("Invalid Score");
            return; // exits the current method ONLY
        }

        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        switch (grade) {
            case "A":
                System.out.println("Excellent, You made an A");
                break;

            case "B":
                System.out.println("Great, You made a B");
                break;

            case "C":
                System.out.println("Good, You made a C");
                break;

            case "D":
                System.out.println("You passed");
                break;

            default:
                System.out.println("You Failed");
        }
    }

    public static void eligibleToVote(int age, boolean isUSCitizen) {

        if (age < 18) { // if age is not qualified
            System.out.println("You must be at least 18 years old");
            return; // exits the current method
        }

        if (isUSCitizen == false) { // if the person is not us citizen
            System.out.println("You must be a US citizen in order to vote");
            return; // exits the current method
        }

        System.out.println("You are eligible to vote");

    }


}
