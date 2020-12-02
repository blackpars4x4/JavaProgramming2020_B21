package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Katy");  //0
        names.add("Amir");  // 1
        names.add("Nadira"); // 2
        names.add("Erjon");  // 3
        names.add("Amir");  //4
        names.add("Aibek"); // 5
        names.add("Ilgar");  //6
        names.add("Amir"); //7
        names.add("Amir"); //7

        System.out.println(names);

        names.remove(1);

        System.out.println(names);

        names.remove("Amir");

        System.out.println(names);

        names.remove(  names.size()-1 );

        System.out.println(names);

        names.clear();

        System.out.println(names);
    }


}
