package day40_Constructor;

public class ConstructorIntro {
    static int b;

    static {
        System.out.println("static block");
        ;
        b = 200; //1
    }

    public ConstructorIntro(int a) {
        System.out.println("constructor with int arg");
        b = 200; //
        this.a = a;
    }
    int a;

    public static void main(String[] args) {
        System.out.println("Hello");
        /*System.out.println(a);*/

        int num = new ConstructorIntro(200).a;

        ConstructorIntro obj2 = new ConstructorIntro(300);
        ConstructorIntro obj3 = new ConstructorIntro(400);
    }
}
