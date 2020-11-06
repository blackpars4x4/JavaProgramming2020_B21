package Day25_ArrayIntro;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalPrice = 0;


        while (true) {
            /*if (yesOrNo.equals("yes")) {
                System.out.println("What bed type? ");
                String bedType = scan.next().toLowerCase();

                switch (bedType){
                    case"king":
                        System.out.println("Bed Type Selected: " + bedType);
                        totalPrice += 120;
                        break;
                    case"queen":
                        System.out.println("Bed Type Selected: " + bedType);
                        totalPrice += 120;
                        break;
                    case"single":
                        System.out.println("Bed Type Selected: " + bedType);
                        totalPrice += 120;
                        break;
                    default:
                        System.out.println("Invalid Entry");
                        System.out.println("Do you want to choose bed type again?");
                        String a = scan.next().toLowerCase();
                        while(!(a.equals("no")|| a.equals("yes"))){
                            System.out.println("Invalid Entry, Please Re-Enter");
                            System.out.println("Do you want to choose bed type again?");
                            a = scan.next().toLowerCase();*/

            System.out.println("if you want to reserve a room? ");
            System.out.println("\t\tKing Bed == 120$\n" +
                    "\t\tQueen Bed == 100$\n" +
                    "\t\tSingle Bed == 80$");
            System.out.println("Type your room type: ");
            String word = scan.nextLine().toLowerCase();

            while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
                System.out.println("Invalid Entry, Please Re-Entry");
                word = scan.nextLine().toLowerCase();
            }

            totalPrice += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room?");
            String a = scan.nextLine().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {// while the answer is not valid answer
                System.out.println("Invalid Entry, Please Re-enter");
                System.out.println("Would you like to select another room?");
                a = scan.nextLine().toLowerCase();
            }// it stops if the answer is either yea of noa

            if (a.equals("no")) {
                break;
            }

        }
        System.out.println("Total Price is: " + totalPrice);
    }
}
/*
            A, King Bed ==> 120$
		    B,  Queen Bed ==> 100$
		    C,  single Bed ==> 80$
 */