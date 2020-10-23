package day08_ShortHand_Relational;

public class Unary_Practice {

    public static void main(String[] args) {
        int a = 100; // a=100
        int b = -a++ + ++a - a-- * a-- % 2;
        // b = - 100 + 102 - 102 * 101 % 2
        // b = - 100 + 102 -  10302 % 2
        //b = -100 + 102 - 0
        //b = 2 - 0 = 2

        System.out.println(b);

        // 10 / 2 = 5
        // 10 % 2 = 0

        // 10 / 3.0 ==> 3.33333
        // remainder: 10 - (3*3) = 1

    }


}


/*
 3. manually calculate the following code fragements:
                1. int a = 100;
                   int b = -a++ + ++a - a-- * a-- % 2;
 */