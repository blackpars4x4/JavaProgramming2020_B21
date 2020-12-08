package OfficeHours.Practice_11_25_2020;

public class MethodPractice2 {
    public static void main(String[] args) {
        // 100, 200
        max(100, 200);

        System.out.println( max(100, 200)   * 2   );

        System.out.println(  max(100, 600, 200) );

        System.out.println( max(1000, 2000, 30, 40) );

    }



    public static int max(int a, int b){
        int maximum = (a >= b )? a : b;
        return maximum;
    }

    public static int max(int a, int b, int c){
        return  max(   max(a,b) ,    c);
    }

    public static int max(int a, int b, int c, int d){
        //  int n =  max(a,b,c);
        return  max( max(a,b,c)  ,  d   );
    }

    public static double max(double a, double b){
        return (a>=b)? a : b ;
    }


    /*
    create methods for min number
    make sure that max method also accepts decimals
     */


}
