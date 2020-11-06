package Day26_Arrays;

import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter? ");
        int length = scan.nextInt();

        double[] numbers = new double[length];

        for(int i = 0; i <= length-1;i++){
            System.out.println("Enter a number ");
            numbers[i] = scan.nextDouble();

        }

        double min = numbers[0];
        double max = numbers[0];

        for(int i = 1 ; i <= length-1; i++ ){
            if(numbers[i] > max){
                max = numbers[i];
            }

            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }
}
