package day39_StaticInitializerBlock;

import day37_CustomClass.Employee;

public class StaticBlocks {

    public static String company = "Bank of America";
    public static Employee employee1 ;
    public static int b;
    public static boolean isEmployeed;

    public int a;
    static{
        /*company = "Capital One";*/
        isEmployeed = true;
        employee1 = new Employee();
        employee1.setInfo("john", company, "SDET", "A123", "Male", 40, 55);
        //
        // a = 100;
        b = 200;
        System.out.println(b);
        System.out.println("Static Block");
    }


    /*
    public static void main(String[] args) {
        company = "Capital One";
        isEmployeed = true;
        employee1 = new Employee();
        employee1.setInfo("john", company, "SDET", "A123", "Male", 40, 55);
        b = 200;
        System.out.println(company);
        System.out.println(employee1);
        System.out.println(b);
        System.out.println(isEmployeed);
    }
*/





}