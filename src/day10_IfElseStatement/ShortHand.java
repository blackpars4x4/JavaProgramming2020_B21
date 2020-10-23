package day10_IfElseStatement;

public class ShortHand {

    public static void main(String[] args) {
    //=:
        int a = 100;
        System.out.println(a); // 100;
        System.out.println(++a); // 101

        a = 200;
        System.out.println(a); //200
        System.out.println(++a); // 201
        System.out.println(a); // 201

        a = 300;
        System.out.println(a); //300

        String name = "Daniel";
        System.out.println(name); // Daniel

        name = "John";
        System.out.println(name);

    // +=:
        int A = 200;
          //  A = A + 100;
            A += 100;  // the adition will be assigned to the variable

        System.out.println(A);

        String school = "Cybertek";
         //      school = school + " School";
        school += " School";  // concatenation assignment

        System.out.println(school);

        int savingAccount = 1000;

            savingAccount += 2000;

        System.out.println(savingAccount); // october

            savingAccount += 500;

        System.out.println(savingAccount); // november

    // -=:
            savingAccount -= 1000;

        System.out.println(savingAccount);

            savingAccount -= 500;

        System.out.println(savingAccount);

    // *=:
        double salary = 100000;
        salary *= 1.2;
        System.out.println(salary);

        int Y = 10;
        Y *= 10;

        System.out.println(Y);

    // /= :

        double tax = 10000;
        tax /= 2;

        System.out.println(tax);

        int B = 3000;
       // B /= 0;

        System.out.println(B);

    // %=:
    // remainder: if numerator cannot be evenly divisible by denominator
        /*
        remainder: what you have left after diving a number by another number
            in math:
                10/4 = 2.5
                remainder: 10 - (4 * 2) = 2

            in java:
                10 % 4 ==> 2
         */

        int T = 100;
            T %= 10;

        System.out.println(T);

        int U = 35;
        U %= 9 ;

        /*
            35/9 =3.88...
            remainder: 35 - (9*3) = 8;
         */

        System.out.println(U);







    }

}
