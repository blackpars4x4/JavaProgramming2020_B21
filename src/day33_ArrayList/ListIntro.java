package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> score = new ArrayList<>();

        score.add(100);
        score.add(200);
        score.add(300);

        System.out.println(score);

        score.add(2, 500);

        System.out.println(score);

        ArrayList<String> groceryList = new ArrayList<>();// Egg, water, milk....
        groceryList.add("Egg");//3
        groceryList.add("Water");//4
        groceryList.add("Milk");//5
        groceryList.add("Bread");//6

        System.out.println(groceryList);

        groceryList.add(0, "Toilet Paper");
        System.out.println(groceryList);
        groceryList.add(1, "Sanitizer");
        System.out.println(groceryList);
        groceryList.add(1, "N95 Masks");
        System.out.println(groceryList);


        String item1 = groceryList.get(2);
        System.out.println("Item1 = " + item1);

        String item2 = groceryList.get(1);
        System.out.println("Item2 = " + item2);


        int total = groceryList.size();
        System.out.println("Total Item = " + total);

        System.out.println(groceryList.get(groceryList.size()-1));




    }
}
