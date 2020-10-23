package day20_ForLoop;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minutes: ");
        int minutes = scanner.nextInt();

        for(int i = minutes; i >0; --i){
            if(i < 0){
                break;
            }
            for(int z=59; z >= 0; --z){
                System.out.println((i-1) + " minutes and " + z + " seconds left");
                Thread.sleep(1000);
            }
        }
        System.out.println();

        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t*       Times is Up, Please take your seats!      *");
        System.err.println("\t\t\t*                                                 *");
        System.err.println("\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
}
