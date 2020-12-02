package day34_ArrayList;

import java.util.ArrayList;

public class WarmUp {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 40);

        System.out.println(numbers);

        numbers.set(numbers.size()-1,0);

        System.out.println(numbers);

        numbers.clear();

        System.out.println(numbers.isEmpty());

        for(int i =0; i <= numbers.size()-1; i++){
            int each = numbers.get(i);  // unboxing
            if(each%2 != 0){
                numbers.set(i, each*2);
            }
        }

        System.out.println(numbers);

        System.out.println("============================================================");

        int[] scores = {65, 75, 77, 85, 68, 88, 82, 72, 95, 99, 98, 94, 93, 96, 97, 71, 70, 72, 72, 73, 55};

        ArrayList<Integer> AList = new ArrayList<>();
        ArrayList<Integer> BList = new ArrayList<>();
        ArrayList<Integer> CList = new ArrayList<>();
        ArrayList<Integer> DList = new ArrayList<>();
        ArrayList<Integer> FList = new ArrayList<>();

        for(int each : scores ){
            if(each>=0 && each<= 100) { // if the score is valid
                if (each >= 90) {
                    AList.add(each);
                } else if (each >= 80) {
                    BList.add(each);
                } else if (each >= 70) {
                    CList.add(each);
                } else if (each >= 60) {
                    DList.add(each);
                } else {
                    FList.add(each);
                }
            }

        }

        System.out.println("total number of A: "+AList.size());
        System.out.println("total number of B: "+BList.size());
        System.out.println("total number of C: "+CList.size());
        System.out.println("total number of D: "+DList.size());
        System.out.println("total number of F: "+FList.size());

        System.out.println("A: "+AList);
        System.out.println("B: "+BList);
        System.out.println("C: "+CList);
        System.out.println("D: "+DList);
        System.out.println("F: "+FList);








    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
			ex:
				list = [1,2,3,4,5];
				output: [1,2,3,4,0];
2. write a program that can multiply each odd number by 2
			ex:
			    list = [1,2,3,4,5];
				output: [2,2,6,4,10]
 */