package Day28_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDArray {
    public static void main(String[] args) {
        int[][] arr2D1 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2D2 = {{10, 20, 30}, {40, 50, 60, 70, 80}};
        int[][] arr2D3 = {{100, 200, 300}, {400, 500, 600, 700, 800}};

        int[][][] arr3D = {arr2D1, arr2D2, arr2D3};
        //                   0        1        2

        System.out.println(Arrays.deepToString(arr2D3));

        //print: {{10, 20, 30}, {40, 50, 60, 70, 80}}
        System.out.println(Arrays.deepToString(arr2D2));

        // print: {400,500,600,700,800}
        System.out.println(  Arrays.toString(arr3D[2][1]) );

        // print 30
        System.out.println( arr3D[1][0][2]);


        int[][][][] arr4D = { arr3D , arr3D };

        int[][][][][] arr5D = {arr4D , arr4D};


    }

}
