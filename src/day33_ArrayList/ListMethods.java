package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(200);
        list1.add(300);

        //Set method for Replace the element
        list1.set(1, 400);
        System.out.println(list1);

        ArrayList<String> names = new ArrayList<>();
        names.add("Yalcin");
        names.add("Amina");
        names.add("Ercan");
        names.add("Ercan");
        names.add("Tayfun");
        names.add("Mustafa");
        names.add("Tayfun");
        names.add("Suveyda");
        names.add("Egemen");


        System.out.println(names);

        names.set(3, "Afrooz");
        names.set(6, "Fiona");
        System.out.println(names);

        int[] arr = {10,20,30,40};
        arr[1] = 200;
        System.out.println(Arrays.toString(arr));
        //output:
        /*
        [10, 200, 30, 40]
         */

        // remove(index)
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        //remove(object)
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        /*list2.remove(2); // remove delete the index number not the specific element
        System.out.println(list2);*/

        //  Character ch = 'C';

        boolean r1 =  list2.remove( Character.valueOf('X')  ); // 67

        System.out.println(list2);
        System.out.println(r1);

        boolean r2 =  list2.remove( Character.valueOf('C')  );

        System.out.println(list2);
        System.out.println(r2);

    }
}
