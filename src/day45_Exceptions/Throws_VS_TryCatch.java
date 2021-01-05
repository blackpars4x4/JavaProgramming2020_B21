package day45_Exceptions;

import library.BrowserUtility;

public class Throws_VS_TryCatch {
    public static void main(String[] args) throws InterruptedException{
        method1();
        System.out.println("Try & Catch");

        // method2();

        // Thread.sleep(3000);
        BrowserUtility.sleep(3);

        System.out.println("Test Completed");

        sleep(7);


    }


    public static void method1() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

    }


    public static void method2() throws InterruptedException{

        Thread.sleep(3000);

    }


    public static void sleep(long seconds) throws InterruptedException {

        Thread.sleep(seconds * 1000);

    }
}
