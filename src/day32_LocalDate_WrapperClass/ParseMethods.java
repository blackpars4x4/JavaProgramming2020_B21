package day32_LocalDate_WrapperClass;

import org.w3c.dom.ls.LSOutput;

public class ParseMethods {
    public static void main(String[] args) {


        String data1 = "123";
        System.out.println(data1+3);//1233

        int num = Integer.parseInt(data1);//none
        //          primitive  =  primitive int
        System.out.println(num);

        Integer num2 = Integer.parseInt(data1);// Autoboxing
        //  wrapper class <===== primitive

        System.out.println(num+3);

        String s1 = "Hello";

        /*int num3 = Integer.parseInt(s1);//will give exception
        System.out.println(num3);//*/

        String s2 = "2.5";
        double d1 = Double.parseDouble(s2);//none
        //  primitive <=== primitive
        Double d2 = Double.parseDouble(s2);// autoboxing
        // wapper class <=== primitive
        System.out.println(d1+1);

        String s3 = "Maybe";// anything other than the boolean it would be default false
        boolean r1 = Boolean.parseBoolean(s3);// none
        Boolean r2 = Boolean.parseBoolean(s3);// autoboxing

        System.out.println(r1);//default value of boolean is false

        String s4 = "FaLse";
        boolean r3 = Boolean.parseBoolean(s4);

        System.out.println(r3);// not case sensitive 



    }

}
