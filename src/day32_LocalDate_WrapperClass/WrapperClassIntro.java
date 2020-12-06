package day32_LocalDate_WrapperClass;

public class WrapperClassIntro {
    public static void main(String[] args) {
        byte b = 100;
        Byte b2 = b;
        //Integer b3 = (int)b;

        int i = 10;
        //  Byte b3 = i; //wrapper class is only dedicated to its own primitive

        Integer I = 20;
        double d = I; //unboxing

        Integer num =  100;
        //  Long L1 = num;
        long L2 = num;

        System.out.println("====================================================");

        Character ch = 'A';
        char ch2 = ch; // unboxing
        int n = ch; // unboxing


        long score = 100;
        //Double d1 = score;
        Long d2 = score;
        Long d3 = d2; // none


        double d4 = score; //none



    }
}
