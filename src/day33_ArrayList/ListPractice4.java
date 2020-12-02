package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(10);
        list.add(50);

        //indexOf() Method:
        int n1 = list.indexOf(10);
        int n2 = list.lastIndexOf(10);
        System.out.println(n1);
        System.out.println(n2);

        //contains() Method:
        System.out.println(!list.contains(60));
        System.out.println(list.contains(40));

        System.out.println("====================================================");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);

        ArrayList<Character> nonDup = new ArrayList<>(); // [A, B, C]

        for(char each : characters){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        /*
          for(int i = 0; i <= characters.size()-1; i++ ){
            if(!nonDup.contains(characters.get(i))){
                nonDup.add(characters.get(i));
            }
        }
         */
        System.out.println(nonDup);

        System.out.println("=======================================");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        //equals() method
        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2));

        System.out.println("=======================================");
        //clear() & isEmpty() Methods
        list1.clear();
        list2.clear();
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());

    }
}
