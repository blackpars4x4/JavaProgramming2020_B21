package day35_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class DogParks {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog dog6 = new Dog();

        dog1.setInfo("Tima", "York", "small", 'M',
                "multicolor", LocalDate.of(2010, 01, 19));

        dog1.getInfo();

        dog2.setInfo("Balli", "Maltese", "small", 'F',
                "white", LocalDate.of(2019, 12, 01));

        dog2.getInfo();

        dog3.setInfo("Richard", "Chow Chow", "Medium", 'M',
                "Brown", LocalDate.of(2015, 7, 2));

        dog3.getInfo();

        dog1.eat("Chicken");

        dog2.drink("Beer");

        dog4.setInfo("Misha", "husky", "big", 'M',
                "chocolate", LocalDate.of(2015, 06, 14));


        Dog[] dogs = {dog1, dog2, dog3, dog4};

        ArrayList<Dog> huskies = new ArrayList<>();
        ArrayList<Dog> Maltese = new ArrayList<>();

        for (Dog eachDog : dogs) {
            if (eachDog.breed.equalsIgnoreCase("husky")) {
                huskies.add(eachDog);
            } else if (eachDog.breed.equalsIgnoreCase("maltese")) {
                Maltese.add(eachDog);
            }
        }

        System.out.println("Total Number of Huskies: " + huskies.size());
        System.out.println("Total Number of Maltese: " + Maltese.size());


    }


}
