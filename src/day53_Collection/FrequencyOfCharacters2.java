package day53_Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters2 {

    public static void main(String[] args) {

        String str = "aaabbc";
        //String res = "";

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String s : str.split("")) { //s: a a a b b c

            int f = Collections.frequency(Arrays.asList(str.split("")), s); //f: 3 3 3 2 2 1

            result.put(s, f);
            //res += s + f;

        }

        System.out.println(result);
        //System.out.println(res);

    }
}
