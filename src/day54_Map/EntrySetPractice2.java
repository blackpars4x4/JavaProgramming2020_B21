package day54_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetPractice2 {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("A",120000);
        employeeInfo.put("B",130000);
        employeeInfo.put("C",110000);
        employeeInfo.put("D",140000);
        employeeInfo.put("E",130000);
        employeeInfo.put("F",150000);

        System.out.println(employeeInfo);

        Integer max = Integer.MIN_VALUE;
        String nameMax = "";

        Integer min = Integer.MAX_VALUE;
        String nameMin = "";

        for (Map.Entry<String, Integer> each : employeeInfo.entrySet()) {
            String name = each.getKey();
            Integer salary = each.getValue();

            if(salary > max){
                max= salary;
                nameMax = name;
            }

            if(salary < min){
                min = salary;
                nameMin = name;
            }

        }


        System.out.println(max);
        System.out.println(nameMax);

        System.out.println(min);
        System.out.println(nameMin);






    }

}