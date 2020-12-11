package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MySalaries {
    public static void main(String[] args) {



        SalaryCalculator salary1 = new SalaryCalculator(40, 55, 9, 22);

        SalaryCalculator salary2 = new SalaryCalculator(40, 55, 0, 23);

        SalaryCalculator salary3 = new SalaryCalculator(45, 35, 8, 21);

        SalaryCalculator salary4 = new SalaryCalculator(45, 65, 8, 24);

        SalaryCalculator salary5 = new SalaryCalculator(50, 70, 9, 22);


        // print the maximum salary after tax


        ArrayList<SalaryCalculator> salaries = new ArrayList<>();
        salaries.addAll( Arrays.asList( salary1,salary2,salary3, salary4, salary5 ) );

        double maxSalaryAfterTax = salaries.get(0).salaryAfterTax;
        double minSalaryAfterTax = salaries.get(0).salaryAfterTax;

        double maxTotalTax = salaries.get(0).totalTax;
        double minTotalTax = salaries.get(0).totalTax;

        for( SalaryCalculator each : salaries){
            maxSalaryAfterTax =Math.max(each.salaryAfterTax ,  maxSalaryAfterTax);
            minSalaryAfterTax = Math.min(each.salaryAfterTax, minSalaryAfterTax);

            maxTotalTax = Math.max( each.totalTax, maxTotalTax);
            minTotalTax = Math.min(each.totalTax, minTotalTax);
        }


        System.out.println("Max salary after tax: "+maxSalaryAfterTax);
        System.out.println("Min salary after tax: "+minSalaryAfterTax);

        System.out.println("Max total tax: "+maxTotalTax);
        System.out.println("Min total tax: "+minTotalTax);


    }
}
