package Day25_ArrayIntro;

public class ArrayIntro {

    public static void main(String[] args) {

        //  String name = "Cybertek", "Muhtar";

       /*
        String name1 = "Azad";
        String name2 = "Ayse";
        String name3 = "Ayse";
        String name4 = "Ayse";
        String name5 = "Ayse";
      */

        String[] names = { "Azad" , "Ayse", "Inna", "Erjon", "Aysel", "Aliya", "Marwan", "Mustafa", "Oguzhan"} ;
        //index num:         0        1        2       3         4      5         6         7           8

        // retrieve data from array:

        System.out.println(   names[2]   );

        String str1 = names[0];
        System.out.println(str1);

        int[] score = {80, 85, 90, 70, 75, 77, 87, 97, 88};
        //  index:     0   1   2   3   4   5   6,  7,  8
        System.out.println("===============================================");
        /*
       // Erjon : 70
        System.out.println(names[0] +" : "+  score[0]);
        System.out.println(names[1] +" : "+  score[1]);
        System.out.println(names[2] +" : "+  score[2]);
        System.out.println( names[3] +" : "+  score[3]);
        */
        //i < 9 is same with  i <= 9-1
        for(int i =0; i < names.length; i++){ // i: 0, 1, 2, 3, 4, 5, 6, 7, 8
            System.out.println( names[i] +" : "+  score[i]);
        }
    }
}
