package day53_Collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class MapPractice2 {

        public static void main(String[] args) {
            TreeMap<String, Integer> scores = new TreeMap<>();
            scores.put("Mohammad", 99);
            scores.put("Hoshang", 98);
            scores.put("Jawad", 82);
            scores.put("Munir", 64);
            scores.put("Akbar", 74);
            scores.put("Spu", 95);
            scores.put("Simona",83);
            scores.put("Pedro",81);

            scores.replace("Mohammad", 79);

            List<String> earlyBirds = new ArrayList<>();  // >= 80
            List<String> angryBirds = new ArrayList<>(); // <= 80

            //  scores.keySet().forEach( p -> { if(scores.get(p) >= 80) earlyBirds.add(p); else angryBirds.add(p); }  );

            for (String name : scores.keySet()) {
                int score = scores.get(name);
                if(score >= 80){
                    earlyBirds.add(name);
                }else{
                    angryBirds.add(name);
                }
            }

            System.out.println("earlyBirds = " + earlyBirds);
            System.out.println("angryBirds = " + angryBirds);


            System.out.println("1============================================================");

            LinkedHashMap<String, LocalDate> birthDays = new LinkedHashMap<>();
            birthDays.put("Jimmy", LocalDate.of(2018, 2, 5));
            birthDays.put("Farzam", LocalDate.of(2010, 2, 2));
            birthDays.put("Dean", LocalDate.of(1995,3,5));
            birthDays.put("Muhtar", LocalDate.of(1976, 5, 19));
            birthDays.put("Ercan", LocalDate.of(1974,3,3));
            birthDays.put("Ayder", LocalDate.of(1989, 4, 4));
            birthDays.put("Ramiz", LocalDate.of(1983,3,12));

            LocalDate youngest = LocalDate.of(1900,1,1);
            String nameYoung = "";

            LocalDate oldest = LocalDate.now();
            String nameOld = "";

            for (String name : birthDays.keySet()) {
                LocalDate DOB = birthDays.get(name);
                if(DOB.isBefore(LocalDate.of(1980,1,1))){
                    System.out.println(name +"  :  "+DOB);
                }

                if(DOB.isAfter(youngest)){  // to find the youngest
                    youngest = DOB;
                    nameYoung = name;
                }

                if(DOB.isBefore(oldest)){ // to find the oldest
                    oldest = DOB;
                    nameOld = name;
                }

            }


            System.out.println("Youngest = " + nameYoung);
            System.out.println("Oldest = " + nameOld);

            System.out.println("2==========================================================");

            TreeMap<String, String> countries = new TreeMap<>();
            countries.put("United States", "Washington DC");
            countries.put("Russia", "Moscow");
            countries.put("The Czech Republic", "Prague");
            countries.put("España", "Madrid");
            countries.put("Brazil","Brasilia");
            countries.put("Germany", "Berlin");
            countries.put("Pakistan", "Islamabad");


            System.out.println(countries);

            //  countries.values().forEach( p -> { System.out.println(p.toUpperCase()); }  );

            for (String value : countries.values()) {
                System.out.println(value.toUpperCase());
            }

            System.out.println("3========================================================");

            // verify:
            boolean r1 = countries.get("Russia").equals("Moscow");
            boolean r2 = countries.containsValue("Moscow");

            // find out the capital of Germany
            System.out.println(countries.get("Germany"));

            System.out.println("4===========================================");
            // find out which country' capital is "Brasilia"
            for (String country : countries.keySet()) {
                String capital = countries.get(country);
                if(capital.equals("Brasilia")){
                    System.out.println(country);
                }
            }

            System.out.println("5===========================================");
            //  find out which country' capital is "Washington DC"

            countries.keySet().forEach( p ->  { if(countries.get(p).equals("Washington DC")) System.out.println(p);  });


            System.out.println("6================================================");

            LinkedHashMap<String, Integer> sdets =new LinkedHashMap<>();
            sdets.put("Afrooz", 150000);
            sdets.put("Muhammad", 150000);
            sdets.put("Ayse", 125000);

            for (String key : sdets.keySet()) {
                Integer value = sdets.get(key);
                sdets.replace(key, value - 500 );
            }

            System.out.println("sdets = " + sdets);


        }

}
/*
Tasks:
	1. create a map that can contain student name and student' score
			put 5 of your friends names and thier scores
			print out the names of the students who made less than 80
	2. create a map that can contains name and Date Of Birth.
			put 5 of your classmates' names and thier date of birth
			print out the names of the students who were born before 1980 January 1st
	3. create a map that can contain names of counties and thier capitals
				use for each loop to print out all the capitals
 */