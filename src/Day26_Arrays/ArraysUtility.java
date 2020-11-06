package Day26_Arrays;

import java.util.Arrays;

/*
Arrays.toString(array): convert arrays to string - must used in order to print whole array list
 */

public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println( numbers[0]);
        System.out.println( numbers[1]);
        System.out.println( numbers[2]);

        System.out.println( numbers); //hashcode

        System.out.println( Arrays.toString(numbers));

        String str1 = "Cybertek";
        System.out.println( str1 );

        String [] clasmates = {"Adil", "Muhammad", "Yasin", "Necdet", "Daniel" };
        System.out.println( clasmates ); //hashcode
        System.out.println(Arrays.toString(clasmates));
        System.out.println(Arrays.toString(clasmates).replace("[","").replace("]",""));


        //  sort(array)

        int[] arr1 = {200000, 1000000, 4000000, 6000, 3000000, 12345551, 90000};

        Arrays.sort(arr1); //does not retrun any value

        System.out.println( Arrays.toString(arr1));
        System.out.println("Max: " + arr1[arr1.length-1]);
        System.out.println("Min: " + arr1[0]);

        double[] arr2 = {1.5, 0.5, 0, 3.5, 1.8,10.25, 10.24, -0.75, -0.5};

        Arrays.sort(arr2);

        System.out.println( Arrays.toString(arr2));

        System.out.println("Second Min: " + arr2[1]);
        System.out.println("Second Max: " + arr2[arr2.length-2]);

        String[] names = {"Haroon", "Nurahmet", "Livio", "Dean", "Ayah", "afrooz", "me"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names).replace("[","").replace("]",""));
        //

    // equals(arr1, arr2)
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 3, 2};

        Arrays.sort(a1);  //[1, 2, 3]
        Arrays.sort(a2);  //[1, 2, 3]

        boolean r1 = Arrays.equals(a1, a2);
        System.out.println(r1);



    }
}

