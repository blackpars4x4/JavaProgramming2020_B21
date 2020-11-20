package day31_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading5 {

    public static void main(String[] args) {

        double[] arr1 = {1.5, 2.5, 3.5};
        double[] arr2 = {4.5, 5.5, 6.5, 7.5};
        double[] arr3 = {8.5, 9.5};
        double[] arr4 = {10.5, 12.5, 11.5};

        double[] arr5 =  combineTwoArrays( combineTwoArrays(arr1, arr2) ,  combineTwoArrays(arr3, arr4) );
        //  combineTwoArrays  ( new array,  new array )
        // new array

        System.out.println(Arrays.toString(arr5) );

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9};
        int[] a3 = {10,11};

        int[] a4 =  combineTwoArrays( combineTwoArrays(a1, a2) , a3 );

        System.out.println(Arrays.toString(a4));

        String[] group27 = {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvanch"};
        String[] group15 = {"Lily" , "Lana", "Igor", "Maryam", "Nilufar", "Ayse"};
        String[] group6 = {"Natalie","Gulistan","Dragisa","Sladjan","Omer", "Alex","Abiel","Marina"};
        String[] group30 = {"Halzat", "Serhii", "Karlygash", "Polina", "Aisha"};
        String[] group3={"Asel","Rauf","Ibrahim","Erhan","Halil","Hanieh","Ruzanna","Jiamila","Jimell","Sofia","Yilihamu","Nueraihemaiti"};
        String[] group31 = {"Livio", "Steph", "Dan","Sobir","Atala", "Yusef","Saafir"};


        String[] group27And15 = combineTwoArrays(group27, group15);
        String[] group6And30 = combineTwoArrays(group6, group30);
        String[] group3And31 = combineTwoArrays(group3, group31);

        String[] cybertek = combineTwoArrays(  combineTwoArrays(group27And15, group6And30) , group3And31   );


        /*
        String[] cybertek = combineTwoArrays(
                    combineTwoArrays(combineTwoArrays(group27, group15), combineTwoArrays(group6, group30)) ,
                    combineTwoArrays(group3, group31)
                    );
        */
        System.out.println(Arrays.toString(cybertek));


    }




    public static int[] combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];

        int i = 0;

        for(int each : arr1){
            arr3[i++] = each;
        }

        for(int each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }

    public static double[] combineTwoArrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length+arr2.length];

        int i = 0;

        for(double each : arr1){
            arr3[i++] = each;
        }

        for(double each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }

    public static String[] combineTwoArrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length+arr2.length];

        int i = 0;

        for(String each : arr1){
            arr3[i++] = each;
        }

        for(String each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }
}
