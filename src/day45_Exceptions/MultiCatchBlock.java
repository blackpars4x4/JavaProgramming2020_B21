package day45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {
    public static void main(String[] args) {

        try{
            System.out.println( 25/0 );
        }catch(NoSuchElementException e) {
            System.out.println("No Such Element Exception");
        }catch(ClassCastException e) {
            System.out.println("Class Cast Exception");
        }catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }catch(NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }catch(RuntimeException e) {
            System.out.println("Run Time Exception");
        }


        System.out.println("================================================");

        String[] names = {"Halid","Agalar", "Ayjeren"};

        try {
            names[10] = "Muhtar";
        }catch(IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception");
        }catch (NoSuchElementException e) {
            System.out.println("No Such Element Exception");
        }catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }catch(RuntimeException e){
            System.out.println("RuntimeException");
        }


    }
}
