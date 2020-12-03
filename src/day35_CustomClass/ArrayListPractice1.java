package day35_CustomClass;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countryNames = {"Andorra", "United Arab Emirates", "Afghanistan", "Turkey", "United States", " Antigua and Barbuda", "Albania", "Colombia", "Venezuela", "Panama", "United Kingdom", "Mexico ", "United States"};

        ArrayList<String> countries = new ArrayList<>(Arrays.asList(countryNames));

        System.out.println(countries);

        countries.removeIf(p -> p.length() >= 10);

        System.out.println(countries);

        System.out.println("====================================================");
        //task02:
        LocalDate[] arr1 = {
                LocalDate.of(2010, 11, 23),
                LocalDate.of(2012, 11, 23),
                LocalDate.of(2013, 11, 23),
                LocalDate.of(2014, 11, 23),
                LocalDate.of(2015, 11, 23),
                LocalDate.of(2016, 7, 23),
                LocalDate.of(2017, 11, 23),
                LocalDate.of(2018, 11, 23),
                LocalDate.of(2019, 11, 23),
                LocalDate.of(2020, 11, 23),
        };


        LocalDate d1 = LocalDate.of(2016, 8, 15);

        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(arr1));// converted to arraylist
        dates.removeIf(p -> p.isBefore(d1));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd-yyyy, EEE");

        for( LocalDate each : dates){
            System.out.println(each.format(df));
        }


    }
}
/*
task01:
			1. create an Array of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
	task02:
			1. create an Array of LocalDate
			2. write a program that can remove all the dates before August-15-2016
 */