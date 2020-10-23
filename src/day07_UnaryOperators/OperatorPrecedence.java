package day07_UnaryOperators;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int x = 2 + 3 * 2 / 1;
        //      2 + 6 / 1
        //      2 + 6 = 8


        System.out.println(x);

        int y = ( 2 + 3 ) * 2;
        //        5 * 2 = 10

        int z = 2 + 3 * 2;
        //      2 + 6 = 8

        System.out.println(y);
        System.out.println(z);

        int w = 78 / 2 * 2 + 3 - 5 % 5;  // *, /, %
            //  39 * 2 + 3 - 5 % 5
            // 78 + 3 - 5 % 5
           // 78 + 3 - 0
          // 81 - 0 = 81

        System.out.println(w); // 81

        int t = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;
        //      8 + 2 + 3 + 5 - 2 - 1 - 0 + 2
        //     = 17
        System.out.println(t);



    }

}
