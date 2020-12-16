package day41_Enclapsulation;

public class Data {

public static String publicVariable = "A";
private static String privateVariable = "B";
static String defaultVariable = "C"; //default access modifier

    // protected static String protectVariable = "D";

    Data(){

    }

    public static void publicMethod(){
        System.out.println("Public Method");
    }

    private static void privateMethod(){
        System.out.println("private Method");
    }

    static void defaultMethod(){
        System.out.println("default Method");
    }
}
