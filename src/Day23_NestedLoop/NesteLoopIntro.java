package Day23_NestedLoop;

public class NesteLoopIntro {


    public static void main(String[] args) {

        for(int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 10; i++) {

                System.out.print(i + "");
            }
            System.out.println();

        }

        System.out.println("======================================");
        /*
         *******
         *******
         *******
         *******
         *******
        */
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 7; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("========================================");


    }
}
