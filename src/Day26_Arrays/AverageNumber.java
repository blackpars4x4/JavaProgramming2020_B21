package Day26_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How Many number? ");
        int length = scan.nextInt();

        int[] numbers = new int[length];// creating new array list
        int sum = 0;

        for(int i = 0; i < length; i++){
            System.out.println("Enter a number: ");
            numbers[i] = scan.nextInt();
            sum += numbers[i];

        }
        double average = (double)sum / length;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
