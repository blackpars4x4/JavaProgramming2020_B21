package day36_CustomClass;

public class Offer {

    public String location, jobTitle, companyName;
    public double salary;
    public boolean hasBenefit, isWFH, hasPTO, isFullTime;

    public void setInfo(String location, String jobTitle, String companyName, double salary, boolean hasBenefit, boolean isWFH, boolean hasPTO, boolean isFullTime) {
        this.location = location;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.isWFH = isWFH;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
    }

    public void getInfo(){
        System.out.println("Company: " + companyName+ "\nLocation: " + location + "\nSalary: $" + salary +
                "\nJob Title: " + jobTitle + "\nHas Benefit: " + hasBenefit + "\nWork From Home: " + isWFH +
                "\nHas PTO: " + hasPTO + "\nis Full time: " + isFullTime);
        System.out.println("===========================================");
    }


}
/*
Mac:
    Command + N + Enter
Windows:
   Alt + Insert
 */