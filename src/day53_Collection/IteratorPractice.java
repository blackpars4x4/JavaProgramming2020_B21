package day53_Collection;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,1,2,3,4,5,6,7,1,2,3,4,5,6 ));

        /*
        for(int i = 0; i<= list.size()-1; i++){
            if( list.get(i) < 5 ){
                list.remove(i);
            }
        }
         */

        /*
        for (int each : list) {
            if(each<5){
                list.remove(each);
            }
        }
         */

        list.removeIf(p -> p < 5 );

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if( it.next() < 5 ){
                it.remove();
            }
        }


        System.out.println(list);


        System.out.println("===================================================");
        Set<Double> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,10.0,1.5, 2.5, 3.5)) ;

        set.removeIf( p -> p < 4.5);

        for( Iterator<Double> i = set.iterator();  i.hasNext() ;   ){
            if( i.next() < 4.5 ){
                i.remove();
            }
        }


        System.out.println(set);

        System.out.println("================================================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Erjon", "Daniel", "Mustafa", "Mohammed"
        ));

        //  names.removeIf( p -> p.equalsIgnoreCase("ahmed"));

        Iterator<String> n = names.iterator();
        while(n.hasNext()){
            String eachName = n.next();
            if(eachName.equalsIgnoreCase("ahmed")){
                n.remove();
            }
        }

        System.out.println(names);



    }

}
