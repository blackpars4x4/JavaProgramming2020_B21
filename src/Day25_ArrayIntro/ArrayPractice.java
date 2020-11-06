package Day25_ArrayIntro;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        String[] students = new String[5];

        System.out.println( students[0]);
        System.out.println( students[1]);
        System.out.println( students[2]);
        System.out.println( students[3]);
        System.out.println( students[4]);

        students[0] = "Agalar";
        students[1] = "Dervis";
        students[2] = "Burak";
        students[3] = "Uludag";
        students[4] = "Ibrahim";

        System.out.println( students[0]); //instead of this method, for loop can able used to print array values
        System.out.println( students[1]);
        System.out.println( students[2]);
        System.out.println( students[3]);
        System.out.println( students[4]);

        System.out.println(students);

        System.out.println("=======================================");

        for(int i = 0; i < students.length; i++){

            System.out.println(students[i]);
        }
    }
}
