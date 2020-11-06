package Day25_ArrayIntro;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] week = {"Monday","Tuesday","Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter the day number of week: ");
        int num = scan.nextInt();

        System.out.println("Today is " + week[num-1]);

    }
}
