package Day26_Arrays;

import java.util.Arrays;

public class OddEven {

    public static void main(String[] args) {

        int[] numbers = new int[100];//last index is 99

        for(int i = 0; i <=99; i++){
            numbers[i] += i;

        }

        System.out.println(Arrays.toString(numbers));

        /*
        1. how many even numbers in the array?
        2. how many odd numbers in the array?
        3. how many numbers can be evenly divisible by 3?
        4. how many numbers can be evenly divisible by 5?
         */

        int countEven = 0;
        int countOdd = 0;
        int count3 = 0;
        int count5 = 0;

        for(int i = 0; i <= 99; i++){
            int eachnumber = numbers[i];
            if(eachnumber % 2 == 0){
                countEven++;
            }
            else{
                countOdd++;
            }
            if (eachnumber % 3 == 0){
                count3++;
            }
            if (eachnumber % 5 == 0){
                count5++;
            }

        }

        System.out.println("Even Numbers: " + countEven);
        System.out.println("Odd Numbers: "+countOdd);
        System.out.println("Divisible by 3: "+count3);
        System.out.println("Divisible by 5: "+count5);

    }
}
