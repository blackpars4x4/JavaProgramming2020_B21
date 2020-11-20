package day31_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading4 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 7, 0, 10, 11, 9, 8};

        arr = sort(arr);

        System.out.println(Arrays.toString(arr));

        double[] arr2 = {5.5, 6.5, 10.5, 11.5, 12.5, 3.5, 4.5};
        arr2 = sort(arr2);

        System.out.println(Arrays.toString(arr2));


        char[] arr3 = {'a', 'd', 'b', 'c', 'f'};
        arr3 = sort(arr3);

        System.out.println(Arrays.toString(arr3));
    }


    public static int[] sort(int[] arr) {  // {2,1,3}

        Arrays.sort(arr);  // {1,2,3};
        int[] reversedArray = new int[arr.length];  // {3, 2, 1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    public static double[] sort(double[] arr) {  // {2.5,1.5,3.5}

        Arrays.sort(arr);  // {1.5,2.5,3.5};
        double[] reversedArray = new double[arr.length];  // {3, 2, 1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    public static char[] sort(char[] arr) {  // {2,1,3}

        Arrays.sort(arr);  // {1,2,3};
        char[] reversedArray = new char[arr.length];  // {3, 2, 1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    public static String[] sort(String[] arr) {  // {Dervis,Burak,Uludag}

        Arrays.sort(arr);  // {1,2,3};
        String[] reversedArray = new String[arr.length];  // {3, 2, 1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }


}

/*
sort: sorts in descending order
    int[]
    double[]
    char[]
    String[]
 */