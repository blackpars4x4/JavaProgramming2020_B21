package day30_ReturnMethods;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {


    }

    //task1:
    public static void positiveNegativeZero(int number) {
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative": "Zero";
        System.out.println(number + " is " + result);
    }
    //task2:
    public static void gradeCalculator(int score) {

        if (score >= 0 && score <= 100) {
            /*
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
             */
            System.out.println( (score>= 90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)?'D':'F' );

        } else {
            System.err.println("Invalid Score");
        }

    }

    // task3:                               {1,2}       {3,4,5}
    public static void combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;  // represents the index nums of arr3

        for(int each : arr1){
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of third array
        }

        // i= 2
        for(int each : arr2){
            arr3[i++]  = each; // each elements of arr2 is being assigned to the index of third array
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3) );

    }

}
