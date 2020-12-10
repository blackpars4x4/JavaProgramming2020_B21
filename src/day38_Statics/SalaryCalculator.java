package day38_Statics;

import java.text.DecimalFormat;

public class SalaryCalculator {
    public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;

    public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {

        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = (stateTaxRate > 1) ? stateTaxRate / 100 : stateTaxRate; //8 will be 0.88
        this.federalTaxRate = (federalTaxRate > 1) ? federalTaxRate / 100 : federalTaxRate;
        salary = calculateSalary();
        salaryAfterTax = calculateSalaryAfterTax();

    }

    public double calculateSalary() {
        return hourlyRate * weeklyHours * 52;
    }

    public double calculateStateTax() {
        return salary * stateTaxRate;
    }

    public double calculateFederalTax() {
        return salary * federalTaxRate;
    }

    public double calculateTotalTax() {
        return calculateStateTax() + calculateFederalTax();
    }

    public double calculateSalaryAfterTax() {
        return salary - calculateTotalTax();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("$0,000.00");
        DecimalFormat df2 = new DecimalFormat("$0.00");
        return "SalaryCalculator{" +
                "hourlyRate= " + ((hourlyRate < 1000)? df2.format(hourlyRate):df.format(hourlyRate)) +
                ", salary= " + df.format(salary) +
                ", salaryAfterTax= " + df.format(salaryAfterTax) +
                '}';
    }

    public boolean equals(SalaryCalculator s1) {
        return this.salary == s1.salary;
    }

}
/*
2. Create a custom class called SalaryCalculator
					Attributes:
						hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax
					Methods:
						calculateSalary: returns the annual salary
						calculateStateTax: returns the total state tax
						calculateFederalTax: returns the total federal tax
						calculateTotalTax: returns the total tax
						calculateSalaryAfterTax: returns the salary after calculator
						setInfo: accepts four arguments (hourlyRate, weeklyHours, stateTax, federalTax) and iitializes all instances
						toString() method
 */