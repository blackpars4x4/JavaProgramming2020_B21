package Day26_Arrays;

import java.util.Arrays;

public class ArrayDescending {
    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 6, 7, 0};

        Arrays.sort(arr); //Ascending order

        System.out.println(Arrays.toString(arr));

        int[] descending = new int[arr.length];

        for(int i = arr.length-1, j = 0; i >= 0; i--, j++){

            //System.out.print(arr[i]+" ");
            descending[j] = arr[i];


        }
        System.out.println(Arrays.toString(descending));
    }
}
