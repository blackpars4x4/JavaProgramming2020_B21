package day35_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        String[] jobTitles = {"SDET", "Scrum Master", "QA", "Developer", "PO", "BA", "CEO", "SDET", "QA", "Developer", "SDET"};

        ArrayList<String> jobs = new ArrayList<>();
        jobs.addAll(Arrays.asList(jobTitles));

        jobs.retainAll(Arrays.asList("SDET", "QA"));

        System.out.println(jobs);

        jobs.removeIf(p -> !p.equals("SDET") && !p.equals("QA"));

        System.out.println(jobs);

        System.out.println("===========================================================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,-1, -2, -3, -4, -1,0,1,2,3));

        // only keep the numbers 7, 8, 9
        numbers.retainAll(  Arrays.asList(7, 8, 9)  );
        //      numbers.removeIf( p ->  !(p==7 || p==8 || p==9) );

        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,-1, -2, -3, -4, -1,0,1,2,3));

        // remove the elements that are less than 7
        numbers2.removeIf( p -> p < 7);


        System.out.println("==============================================");
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,100, 200, 300, 400, 500, 12, 130));

        // soolution1:
        // list.removeIf( p -> p > 100);

        // solution 2:
        ArrayList<Integer> temp = new ArrayList<>();

        for( int each: list){
            if(each <= 100){
                temp.add(each);
            }
        }

        list = temp;

        System.out.println(list);




    }
}
/*
task03:
			1. create an Array of String called jobTitles
			2. write a program that only keeps the jobTitles that are: SDET and QA
	task04:
		Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
				solution 1: use lambda
			*/