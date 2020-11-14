package day29_Methods;

import java.util.Scanner;

public class VoidMethodsPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        sumOf3Nums(10, 20, 30);
        sumOf3Nums(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public static void sumOf3Nums(int n1, int n2, int n3) {
        System.out.println("Sum is: " + (n1 + n2 + n3));
    }
}
