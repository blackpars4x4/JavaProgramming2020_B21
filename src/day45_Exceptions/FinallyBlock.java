package day45_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {
        try{
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            //  System.exit(0);

        }finally {
            System.out.println("Finally: Closed");
        }


        System.out.println("Test Completed");

    }
}
