package Day23_NestedLoop;

public class NesteLoopPractice {

    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
        ******
        *******
        ********
        */

        for(int j = 1; j <= 8; j++){
            for(int i = 1; i <= j; i++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======================================");

        /*
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *
         */

        for(int j = 8; j >= 1; j--){
            for(int i = 1; i <= j; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

