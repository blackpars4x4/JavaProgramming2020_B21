package day20_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = scanner.nextLine();

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        System.out.println("Result: " + result);

        System.out.println("Checking the palindrome Status of the result...");
        if(result.equalsIgnoreCase(word)){
            System.out.println(word +" is a palindrome" );
        }
        else{
            System.out.println(word + " is not a palindrome");
        }
    }
}
