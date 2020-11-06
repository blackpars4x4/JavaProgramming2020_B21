package day21_WhileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for(int i =1; i <= 5; i++){

            if(i==3){
                continue;
            }

            System.out.print(i+" "); // 1 2 4 5
        }

        System.out.println();

        System.out.println("============================================");

        //1. print odd number between 1 to 50 (MUST use continue statement)
        //2. print even number between 1 to 50  (MUST use continue statement)
        //3. print numbers between 1 to 50 that are evenly divisible by 3 (MUST use continue statement)

        for(int i = 1; i <=50; i++){

            if(i%2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("============================================");

        for(int i = 1; i <=50; i++){

            if(i%2 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("============================================");

        for(int i = 1; i <=50; i++){

            if(i%3 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("============================================");
    }
}
