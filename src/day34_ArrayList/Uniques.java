package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {

    public static void main(String[] args) {
        String str = "aabaacddddefffffghhhhhi";

        ArrayList<Character> list = new ArrayList<>();

        for(char each : str.toCharArray()) list.add(each);

        for(char each : list){
            if(Collections.frequency(list, each) == 1){
                System.out.print(each);
            }
        }
    }
}
