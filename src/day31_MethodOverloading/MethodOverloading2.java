package day31_MethodOverloading;

public class MethodOverloading2 {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

        System.out.println(sum(10.5, 20.5));
        System.out.println(sum(10.5, 20.5, 30.5));
        System.out.println(sum(10.5, 20.5, 30.5, 40.5));

        String str = "Cybertek School";
        String s1 = str.substring(0, str.indexOf(" ") );   // Cybertek
        String s2 = str.substring( 0 );  // Cybertek School

        System.out.println(s1);
        System.out.println(s2);
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + sum(b, c);
    }

    public static int sum(int a, int b, int c, int d) {
        return sum(a, b, c) + d;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, double b, double c){
        return sum(a,c) + b;
    }

    public static double sum(double a, double b, double c, double d){
        return sum(a,c,b) + d;
    }



}
