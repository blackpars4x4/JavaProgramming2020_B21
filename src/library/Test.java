package library;

import day41_Enclapsulation.Data;
import static day41_Enclapsulation.Data.*;

public class Test {
    public static void main(String[] args) {
    System.out.println(Data.publicVariable);
    //    System.out.println(Data.privateVariable);
    /*System.out.println(Data.defaultVariable);*/

   /* Data obj = new Data();*/

        Data.publicMethod();
        // Data.privateMethod(); //unreachable - only reachable when it in same claskk
        // Data.defaultMethod(); // as long as in same package reachable

}
}
