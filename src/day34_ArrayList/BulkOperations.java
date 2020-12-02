package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //containsAll:
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);

        //verify if 10 is contained in the list
        boolean r1 = list.contains(10);

        //verify if 10, 30, 50 & 60
        boolean r2 = list.contains(10) && list.contains(30) && list.contains(50) && list.contains(60);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2); // false

        // verify if 10, 30, 50 & 60 all are contained in the lost
        boolean r3 = list.containsAll(Arrays.asList(10, 30, 50, 60));

        ArrayList<String> group1 = new ArrayList<>();
        group1.add("Mohammad");
        group1.add("Svetlana");
        group1.add("Ahmed");
        group1.add("Ercan");

        //Ahmed, Ercan, Biden

        boolean r5 = group1.containsAll(Arrays.asList("Ahmed", "Ercan", "Biden"));
        System.out.println("r5 = " + r5);


        // Mohammed, Ahmed, Svetlana
        boolean r6 = group1.containsAll(  Arrays.asList( "Mohammad", "Ahmed", "Svetlana")  );
        System.out.println("r6 = " + r6);

        System.out.println("===========================================================");

        // addAll()

        ArrayList<Character> chars = new ArrayList<>();  //A, Z, C, B, H, I, K
        chars.addAll(  Arrays.asList('A', 'Z', 'C', 'B', 'H', 'I', 'K')  );

        System.out.println(chars);

        String[] names = {"Mustafa", "Numan", "Abdullah","Inna", "Emre", "Sinan","Ramiz","Olesea","Irina","Irina","Irina","Inna","Inna","Inna"};

        ArrayList<String> students = new ArrayList<>( Arrays.asList(names) );

        // students.addAll( Arrays.asList(names)  );

        System.out.println(students);

        ArrayList<Character> ch1 =  new ArrayList<>( Arrays.asList('A', 'B', 'C', 'D', 'E') );
        System.out.println(ch1);
        ch1.addAll( Arrays.asList('J', 'K', 'L', 'M', 'N') );

        System.out.println(ch1);

        System.out.println("=================================================");

        ArrayList<String> group2 = new ArrayList<>();
        group2.addAll( Arrays.asList( names ) );

        System.out.println(group2);
        /*
        group2.remove("Irina");
        group2.remove("Sinan");
        group2.remove("Inna");
        group2.remove("Mustafa");
        */

        group2.removeAll(  Arrays.asList("Inna", "Irina", "Mustafa", "Sinan") );

        System.out.println(group2);

        System.out.println("===========================================================");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(  Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz") );
        /*
        for(int i=0; i <= employees.size()-1; i++){
            if( employees.get(i).equals("Ahmed")  ){
                employees.remove(i); // without the interface iterable, remove method cannot be used in loop
            }
        }
        */

        employees.removeAll(  Arrays.asList("Ahmed") );

        System.out.println(employees);

        System.out.println("=========================================================");
        // retainAll
        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(  Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz") );

        System.out.println(employees2);

        employees2.retainAll( Arrays.asList("Ahmed") );

        System.out.println(employees2);





    }
}
