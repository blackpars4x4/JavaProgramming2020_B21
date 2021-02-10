package day54_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetPractice {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("A", 85);
        students.put("B", 75);
        students.put("C", 95);
        students.put("D", 87);
        students.put("E",88);


        System.out.println("=================================================");

        for(String eachKey : students.keySet()){
            System.out.println(eachKey);
        }

        System.out.println("=================================================");

        for(Integer eachValue : students.values()){
            System.out.println(eachValue);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
/*
        for(Map.Entry<String, Integer> each : students.entrySet()){// each: each pair of data
            String eachKey = each.getKey();
            Integer eachValue = each.getValue();

            System.out.println(eachKey + " : " + eachValue);
        }
*/
        for(Map.Entry<String, Integer> each : students.entrySet()){// each: each pair of data

            System.out.println(each);
            System.out.println("-----------");
            System.out.println(each.getKey()+"="+each.getValue());
            System.out.println("===========");

        }
    }
}
