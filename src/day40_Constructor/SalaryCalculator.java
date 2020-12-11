package day40_Constructor;

import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;

public class SalaryCalculator {
    public static int weekWorkingDays, numberOfWeeks;
    public double weeklyHours, hourlyRate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;

    static{
        weekWorkingDays = 5;
        numberOfWeeks = 52;
    }
    //                                                                      8
    //                                                                    0.08                      0.2
    public SalaryCalculator(double weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        if(stateTaxRate > 1){
            stateTaxRate /= 100;
        }

        if(federalTaxRate > 1){
            federalTaxRate /= 100;
        }

        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        salary = weeklyHours * hourlyRate * numberOfWeeks;
        totalTax = salary * stateTaxRate + salary * federalTaxRate;
        salaryAfterTax = salary - totalTax;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "SalaryCalculator{" +
                "weeklyHours= " + weeklyHours +
                ", hourlyRate= $" + hourlyRate +
                ", stateTaxRate= " + stateTaxRate +
                ", federalTaxRate= " + federalTaxRate +
                ", salary= $" + df.format(salary) +
                ", salaryAfterTax= $" + df.format(salaryAfterTax) +
                ", totalTax= $" + df.format(totalTax) +
                '}';
    }




}


