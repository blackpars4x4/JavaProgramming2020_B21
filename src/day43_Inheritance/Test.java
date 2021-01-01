package day43_Inheritance;


class Data {
    public Data(){

    }

    public static int publicVariable = 100;
    static int defaultVariable = 200;
    private static int privateVariable = 300;

    //setInfo()
}

public class Test extends Data {
    public static void main(String[] args) {
        System.out.println(Test.publicVariable);
        System.out.println(Test.defaultVariable);
        // System.out.println(Test.privateVariable);
    }
}
