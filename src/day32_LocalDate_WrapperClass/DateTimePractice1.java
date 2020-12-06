package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimePractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first person' birth year, month, day");
        LocalDate DofB1 = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Enter second person' birth year, month, day");
        LocalDate DofB2 = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        if(DofB1.isBefore(DofB2)){
            System.out.println("First person is older");
        }else if(DofB2.isBefore(DofB1)){
            System.out.println("Second person is older");
        }else{
            System.out.println("Same age");
        }

         /*
        // current age:
        int age1 = LocalDate.now().getYear() - DofB1.getYear();
        int age2 = LocalDate.now().getYear() - DofB2.getYear();
        // after 30 years:
        int after1 = age1+30;
        int after2 = age2+30;
         */

        // 30 year after:
        //  2050                          -  2000     = 50
        int age1 = LocalDate.now().plusYears(30).getYear() - DofB1.getYear();
        // 2050                            - 1990     = 60
        int age2 = LocalDate.now().plusYears(30).getYear() - DofB2.getYear();


        System.out.println("After thirty years, person A will be: "+age1);
        System.out.println("After thirty years, person B will be: "+age2);

        LocalDate DofB3 = LocalDate.of(1980,12,5);

        System.out.println(calculateAge(DofB3, 20) + " years old");

    }
     /*
    parameters:
        DofB
        year
     */

    public static int calculateAge(LocalDate DofB, int year){
        return LocalDate.now().plusYears(year).getYear() - DofB.getYear();
    }
}
