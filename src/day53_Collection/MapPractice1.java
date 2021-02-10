package day53_Collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Afrroz", 120000.0);
        employeeInfo.put("Muhammet", 120000.0);

        System.out.println(employeeInfo.size());
        System.out.println(employeeInfo);

        System.out.println("Salary of Muhammet is " + employeeInfo.get("Muhammet"));
        System.out.println("Salary of Afrroz is " + employeeInfo.get("Afrroz"));


        System.out.println(employeeInfo.containsKey("Muhammet"));
        System.out.println(employeeInfo.containsKey("Ayse"));

        System.out.println(employeeInfo.containsValue(120000.0));

        //employeeInfo.clear();
        //System.out.println(employeeInfo);
        System.out.println("=======================================================");

        for (String eachKey : employeeInfo.keySet()) {

            System.out.println(eachKey + " : " + employeeInfo.get(eachKey));

        }

        System.out.println("=========================================================");

        employeeInfo.put("Mustafa", 150000.0);
        employeeInfo.put("Emre", 103000.0);
        employeeInfo.put("Apo", 100000.0);

        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        String nameMax = "", nameMin = "";

        for (String eachName : employeeInfo.keySet()) {

            double eachSalary = employeeInfo.get(eachName);

            if (eachSalary > max) {
                max = eachSalary;
                nameMax = eachName;
            }
            if(eachSalary < min){
                min = eachSalary;
                nameMin = eachName;
            }


        }
        System.out.println("Max Salary: " + nameMax + " : " + max);
        System.out.println("Min Salary: " + nameMin + " : " + min);


        System.out.println("====================================================");

        System.out.println(employeeInfo);

        employeeInfo.values().forEach(p -> { System.out.println(p); });//Both method same

        System.out.println("________________________________");

        for(Double eachValue : employeeInfo.values()){//Both method same

            System.out.println(eachValue);

        }

        List<Double> salaries = (ArrayList) employeeInfo.values(); // casting is faster then collections
        System.out.println(salaries);

    }
}
