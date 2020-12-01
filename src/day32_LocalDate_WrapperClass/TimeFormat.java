package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;
public class TimeFormat {

    /*
LocalDate:
    year: yyyy
    month: MM (number), MMM(three letters of month), MMMM(full name)
    days: dd
    name of day: E(three letters) , EEEE (full name)
LocalTime:
    hours: hh
    minutes: mm
    seconds: ss
    am/pm: a
 */

    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyy EEEE");

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println(today.format(df));

        System.out.println("=============================================================");

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime now = LocalTime.now();

        System.out.println(now);

        System.out.println(now.format(tf));

        System.out.println("=============================================================");


        LocalTime t1 = LocalTime.of(23,35,55);
        System.out.println(t1);
        System.out.println(t1.format(tf));


        System.out.println("=============================================================");

        // Monday, 12:40 PM,  Nov/23/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");

        LocalDateTime dt1 = LocalDateTime.now();

        System.out.println(dt1);
        System.out.println(dt1.format(dtf));

        System.out.println("=============================================================");

        //task:

        LocalDate tomorrow = LocalDate.of(2020, 11,24);
        System.out.println(tomorrow.format(df));

        boolean r1 = today.isBefore(tomorrow);
    }
}
