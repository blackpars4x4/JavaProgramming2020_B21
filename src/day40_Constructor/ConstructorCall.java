package day40_Constructor;

public class ConstructorCall {
    public ConstructorCall(){
        System.out.println("Default constructor");
    }

    public ConstructorCall(int a){ // default, int
        // ConstructorCall();
        this(); // calling the default constructor
        System.out.println("Constructor with int arg");
    }

    public ConstructorCall(String str){ // dfeault, int, string
        this(10); // default, int
        //   this();  // one constructor can ONLY call one constructor
        System.out.println("Constructor with String arg");
        //   this(10); // default, int   // constructor call MUST be at first step
    }


    public static void main(String[] args) {
        ConstructorCall obj1 = new ConstructorCall("A");

    }

    public void method4(){
        // ConstructorCall();
    }

    public static void method1(){
        //  ConstructorCall();
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
    }

    public static void method3(){
        method1();
        method2();
        System.out.println("Method 3");
    }
}
