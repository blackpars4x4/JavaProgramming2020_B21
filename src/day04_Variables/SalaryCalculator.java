package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        // salary: 150000,  taxRate: 0.28

        int salary = 150000; // whole numbers
        double taxRate = 0.28; // decimal

        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your total tax will be: ");
        System.out.println(totalTax);

        System.out.println("Your salary after tax will be: ");
        System.out.print("$ ");
        System.out.println( salaryAfterTax );


    }

}

/*
write a program that can calculate the salary after tax based on the salary and tax rate
			Ex:
				if salary = 100000
				   taxRate = 0.28

				   totalTax = salary * taxRate;
				   salary after tax = salary - totalTax
 */
