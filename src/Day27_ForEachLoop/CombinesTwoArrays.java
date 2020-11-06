package Day27_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CombinesTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[(arr1.length+arr2.length)];
        int j = 0;//represent the index num of 3rd array

            for(int each : arr1){// each; 1 2 3 4
                arr3[j++] = each;
            }
            for(int each : arr2) {
                arr3[j++] = each;
            }
        System.out.println(Arrays.toString(arr3));

    }

}
