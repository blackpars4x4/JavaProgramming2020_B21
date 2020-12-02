package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE";
        String result = "";

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split("")));

        /*for (String each : str.split("")) list.add(each);// we get every character from str and add them into arraylist so that we can use frequency method
        System.out.println(list);*/

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if(!result.contains(each)) {
                result += each + frequency;
            }
        }

        System.out.println(result);

    }
}
