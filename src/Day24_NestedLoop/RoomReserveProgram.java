package Day24_NestedLoop;

import java.util.Scanner;

public class RoomReserveProgram {
     /*
    2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom? does he/she wants to reserve and calculats the total price,
            and then the program will ask:
                do you want to reserve another room?:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;

        System.out.println("Do you want to reserve a room?");
        String yesOrNo = scan.next();

        while (yesOrNo.equalsIgnoreCase("yes")) { // YES NO yeS nO Yes

            System.out.println("Which bed type do you want?");
            String bedType = scan.next().toLowerCase();  // king, queen, single, king bed

            switch (bedType) {
                case "king":
                    totalPrice += 120;  // totalPrice = totalPrice + 120
                    break;
                case "queen":
                    totalPrice += 100;
                    break;
                case "single":
                    totalPrice += 80;
                    break;
                default:
                    System.out.println("Invalid room type");
            }

            System.out.println("Do you want to reserve another room?");
            yesOrNo = scan.next();

        }

        System.out.println("total price: " + totalPrice);

    }
}
