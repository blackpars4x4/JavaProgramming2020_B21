package day31_MethodOverloading;

public class MethodOverloading3 {

    public static void main(String[] args) {

        double[] arr = {1.5, 2.5, 3.5, 0, 0.5, 1};

        System.out.println(max(arr));
        System.out.println(min(arr));


    }

    public static int max(int[] arr){
        int max =arr[0];
        for( int each  : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static double max(double[] arr){
        double max =arr[0];
        for( double each  : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static int min(int[] arr){
        int min =arr[0];
        for( int each  : arr ){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    public static double min(double[] arr){
        double min =arr[0];
        for( double each  : arr ){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

}
