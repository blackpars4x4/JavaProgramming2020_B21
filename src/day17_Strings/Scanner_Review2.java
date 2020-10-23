package day17_Strings;

/*
- Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.


 */

import java.util.*;

public class Scanner_Review2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name");
        String product = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt(); // We have to hit enter to submit the information

        input.nextLine();  // the enter from the above method will be absorbed

        System.out.println("Enter their full name");
        String fullName = input.nextLine();

        System.out.println("Enter your address");
        String address = input.nextLine();

        System.out.println(fullName +  " your order for " + quantity + " " + product + " has been placed. Your total is " + (price * quantity) );

    }
}
