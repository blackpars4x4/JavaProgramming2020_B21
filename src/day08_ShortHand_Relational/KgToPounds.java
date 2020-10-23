package day08_ShortHand_Relational;

public class KgToPounds {

    public static void main(String[] args) {
        int kg = 100;

        int pounds = (int) (kg * 2.20462);

        System.out.println( kg +" kg equal to " + pounds + " pounds");

    }

}

/*
2. write a program that can convert the given number of kg to pounds
            Note: MUST return integer result

            Ex:
                kg = 100;

                output:
                    10 kg equal to 220 pounds

            Hint: 1kg = 2.20462 pounds
 */
