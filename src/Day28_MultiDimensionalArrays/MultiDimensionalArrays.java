package Day28_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2};

        int[] arr2 = {3,4,5,6,7};

        int[] arr3 = {8,9,10,11,12,13};


        int[][] arrays = {arr1,arr2,arr3};


        //retrieve the element:6
        System.out.println(arrays[1][3]);

        //retrieve the element: 8
        System.out.println(arrays[2][0]);

        //retrieve the array: {3,4,5,6,7}
        System.out.println(Arrays.toString(arrays[1]));

        //print entire arrays:
        System.out.println(Arrays.deepToString(arrays));

        System.out.println("===============================================================");
        /*
        [Lily, Lana, Igor]
Lily Lana Igor
[Polina, Serhii, Abdujilil, Aziz, Halzat]
Polina Serhii Abdujilil Aziz Halzat
[Justyna, Adil, Ercan, Irina, Med, Olesea, Vlad, Asuman, Guvanch]
Justyna Adil Ercan Irina Med Olesea Vlad Asuman Guvanch
         */

        String[][] batch21 = { // iterating the multidimensional array to separate arrays
                {"Lily","Lana","Igor"} ,   //0

                {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat" } ,  //1

                {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvanch"},//2

        };

        for(int i = 0; i <= batch21.length-1; i++){
            System.out.println(Arrays.toString(batch21[i]));

            for (int j = 0; j <= batch21[i].length-1; j++){
                System.out.print(batch21[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("===========================================");

        /*
        Output:
        [Lily, Lana, Igor]
Igor Lana Lily
[Polina, Serhii, Abdujilil, Aziz, Halzat]
Halzat Aziz Abdujilil Serhii Polina
[Justyna, Adil, Ercan, Irina, Med, Olesea, Vlad, Asuman, Guvanch]
Guvanch Asuman Vlad Olesea Med Irina Ercan Adil Justyna
         */

        String[][] batch22 = {// iteration and REVERSE separate arrays
                {"Lily","Lana","Igor"} ,   //0

                {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat" } ,  //1

                {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvanch"},//2

        };

        for(int i = 0; i <= batch22.length-1; i++){
            System.out.println(Arrays.toString(batch22[i]));

            for (int j = batch22[i].length-1; j >= 0; j--){
                System.out.print(batch22[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("===========================================");

        /*
        Output:
        Guvanch  Asuman  Vlad  Olesea  Med  Irina  Ercan  Adil  Justyna  Halzat  Aziz  Abdujilil  Serhii  Polina  Igor  Lana  Lily
         */

        String[][] batch23 = {// iteration and REVERSE separate arrays
                {"Lily","Lana","Igor"} ,   //0

                {"Polina", "Serhii", "Abdujilil", "Aziz", "Halzat" } ,  //1

                {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvanch"},//2

        };

        for(int i = batch21.length-1; i >= 0 ; i-- ){ // i: 2, 1, 0    represents the index num of 1D arrays

            for(int j = batch21[i].length-1;  j >=0; j-- ){ // j: represents the index of elements
                System.out.print( batch21[i][j] +"  "  );
            }

        }

    }
}
