package day30_ReturnMethods;

public class ReturnMethodsIntro {

    public static void main(String[] args) {

        // int multiplication =  addition(10, 20) * 3;
        //   int z =    addition(100, 200);

        System.out.println("=================================");

        System.out.println(addition2(10, 20));

        int sum = addition2(10, 20);

        int multiplication = sum * 3;

        System.out.println(multiplication);
    }

    // void method
    public static void addition(int n1, int n2) {
        int n3 = n1 + n2;
        System.out.println(n3);
    }

    // return method
    public static int addition2(int n1, int n2) {
        int n3 = n1 + n2;
        return n3;
    }
}
