package day17_Strings;

import java.lang.String; // This Package is always automatically importing

public class String_Memory {

    public static void main(String[] args) {

                    /*
                        String pool:
   strOne -->             "java"    <-- strTwo
                            "Java"  <-- strFive

                        Heap:
                            "java"    <- strThree
                            "java"    <- strFour
                     */

        String strOne = "java"; // literal
        String strTwo = "java"; // literal
        String strThree = new String("java"); // Don't type original
        String strFour = new String("java");

        System.out.println(strOne == strTwo); // true
        System.out.println(strOne == strThree); // false


        System.out.println(strThree == strFour); // false


        String strFive = "Java"; // made in the String pool

        System.out.println(strOne == strFive); // false

    }

}
