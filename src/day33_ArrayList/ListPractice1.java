package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);

        System.out.println("Last Odd Number: " + odd.get(odd.size() - 1));

        System.out.println("Last Even Number: " + even.get(even.size() - 1));
        /*
        Output:
        Odd: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99]
        Even: [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100]
        Last Odd Number: 99
        Last Even Number: 100
         */
        System.out.println("====================================================");


        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[][] arr2D = {arr1, arr2};

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int each : arr1)
            list1.add(each);
        System.out.println(list1);
        for (int each : arr2)
            list1.add(each);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int[] each1D : arr2D) {
            for (int eachElement : each1D) {
                list2.add(eachElement);
            }
        }
        System.out.println(list2);

    }
}
