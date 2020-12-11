package day37_CustomClass;

public class Employee {public String name, company, jobTitle, ID, gender;
    public int weeklyHours;
    public double hourlyRate, salary;

    public void setInfo(String name, String company, String jobTitle, String ID, String gender, int weeklyHours, double hourlyRate) {
        this.name = name;
        this.company = company;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.gender = gender;
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.salary = calculateSalary();
    }

    public double calculateSalary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double calculateTax(double stateTaxRate, double federalTaxRate){
        return calculateSalary() * stateTaxRate +  calculateSalary() *federalTaxRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }


}

/*
    setInfo
    toString
 */
