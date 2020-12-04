package day36_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Dean {
    public static void main(String[] args) {

        ArrayList<Offer> offers = new ArrayList<>();
        offers.addAll(Arrays.asList( new Offer(), new Offer(), new Offer(), new Offer(), new Offer() ));

        offers.get(0).setInfo("CA", "SDET", "CapitalOne", 120000, true, true, false, false);
        offers.get(1).setInfo("VA", "QA", "Apple", 115000, true, true, true, true);
        offers.get(2).setInfo( "VA", "Scrum Master", "American Express", 100000, true, false, false, true);
        offers.get(3).setInfo("NY","SDET","MIT",150000,true,true,false,false);
        offers.get(4).setInfo("TX", "SDET", "Bank Of America", 100000, true, false, true, true);

        /*
       for(int i = 0; i <= offers.size()-1; i++){
          offers.get(i).getInfo();
       }
         */

        System.out.println("===========================================================");
        // only print the offers from VA

        for(Offer each : offers){
            if(each.location.equals("VA") && each.salary >= 110000 && each.jobTitle.equals("SDET")){
                each.getInfo();
            }
        }
        System.out.println("===========================================================");

        ArrayList<Offer> LocalOffers = new ArrayList<>(offers);




    }


}
