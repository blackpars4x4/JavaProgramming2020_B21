package day39_StaticInitializerBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(5,7,15,false);
        carpets[1].customOrder(5,7,15,true);
        carpets[2].customOrder(8,10,12,false);
        carpets[3].customOrder(10,15,13,true);
        carpets[4].customOrder(15,20,20,true);

        ArrayList<Carpet> persianCarpets = new ArrayList<Carpet>(Arrays.asList(carpets));
        persianCarpets.removeIf(p->!p.isPersian);

        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        //regularCarpets.removeAll(persianCarpets);
        regularCarpets.removeIf(p->p.isPersian);

        System.out.println("====================================================================");

        double totalPriceOfPersianCarpets = 0;
        for(Carpet each : persianCarpets){
            System.out.println(each);
            totalPriceOfPersianCarpets += each.calcCost();
        }

        System.out.println("Total Price of Persian Carpets= " + totalPriceOfPersianCarpets);

        System.out.println("================================================================");

        double totalPriceOfRegCarpets = 0;
        for (Carpet each : regularCarpets) {
            System.out.println(each);
            totalPriceOfRegCarpets += each.calcCost();
        }

        System.out.println("totalPrice = " + totalPriceOfRegCarpets);

        System.out.println("=============================================");
        double totalPrice = totalPriceOfPersianCarpets + totalPriceOfRegCarpets;

        System.out.println("totalPrice = " + totalPrice);




    }
}
