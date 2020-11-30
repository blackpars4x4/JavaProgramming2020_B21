package library;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtility {

    /*
    returns the maximum number from an array of integer
     */
    public static int max(int[] arr) {
        int max = arr[0];

        for (int each : arr) {

            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    /*
    returns the min number from an array of integer
     */
    public static int min(int[] arr) {
        int min = arr[0];

        for (int each : arr) {

            if (each < min) {
                min = each;
            }
        }
        return min;
    }


    /*
    combins two arrays of integers and return new array
     */
    //                                      {1,2}       {3,4,5}
    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;  // represents the index nums of arr3

        for (int each : arr1) {
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of third array
        }

        // i= 2
        for (int each : arr2) {
            arr3[i++] = each; // each elements of arr2 is being assigned to the index of third array
        }

        Arrays.sort(arr3);
        return arr3;

    }

    /*
    combins two arrays of double and return new array
     */
    //                                      {1,2}       {3,4,5}
    public static double[] combineTwoArrays(double[] arr1, double[] arr2) {
        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0;  // represents the index nums of arr3

        for (double each : arr1) {
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of third array
        }

        // i= 2
        for (double each : arr2) {
            arr3[i++] = each; // each elements of arr2 is being assigned to the index of third array
        }

        Arrays.sort(arr3);
        return arr3;

    }

    /*
    combins two arrays of char and return new array
     */
    //                                      {1,2}       {3,4,5}
    public static char[] combineTwoArrays(char[] arr1, char[] arr2) {
        char[] arr3 = new char[arr1.length + arr2.length];
        int i = 0;  // represents the index nums of arr3

        for (char each : arr1) {
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of third array
        }

        // i= 2
        for (char each : arr2) {
            arr3[i++] = each; // each elements of arr2 is being assigned to the index of third array
        }

        Arrays.sort(arr3);
        return arr3;

    }

    /*
    combins two arrays of String and return new array
     */
    //                                      {1,2}       {3,4,5}
    public static String[] combineTwoArrays(String[] arr1, String[] arr2) {
        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0;  // represents the index nums of arr3

        for (String each : arr1) {
            arr3[i++] = each; // each elements of arr1 is being assigned to the index of third array
        }

        // i= 2
        for (String each : arr2) {
            arr3[i++] = each; // each elements of arr2 is being assigned to the index of third array
        }

        Arrays.sort(arr3);
        return arr3;

    }


    /*
    sorts the array of integers in descending order, and returns it as an array
     */
    public static int[] sort(int[] arr) { //{2,1,3}
        Arrays.sort(arr); //{1,2,3}
        int[] reversedArray = new int[arr.length]; // //{3,2,1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;

    }


    /*
    replace the "[" with "{" while printing the array
     */
    public static String printArray(int[] arr) {
        String str = Arrays.toString(arr);
        str = str.replace("[", "{").replace("]", "}");
        return str;

    }

    public static void matrixCreator(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Math.abs(j - i) + " ");
            }
            System.out.println();
        }

    }


    /*
    adding int element to an int array
     */
    //                             {1,2,3,4,5}     6
    public static int[] addElement(int[] array, int number) {
        int[] result = new int[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }

        result[result.length - 1] = number;

        return result;
    }

    /*
    adding double element to an double array
     */
    public static double[] addElement(double[] array, double number) {
        double[] result = new double[array.length + 1];

        for (int i = 0; i <= array.length - 1; i++) {
            result[i] = array[i];
        }

        result[result.length - 1] = number;

        return result;
    }

    /*
    adding char element to an char array
     */
    public static char[] addElement(char[] array, char number){
        char[] result = new char[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = number;

        return result;
    }

    /*
    adding string element to an string array
     */
    public static String[] addElement(String[] array, String number){
        String[] result = new String[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = number;

        return result;
    }
}
