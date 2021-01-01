package Day44_InheritancePractice;

class A{

    public A(){
        System.out.println("A");
    }

}

class B extends A{

    public B(){ // A B
        // super(); // A
        System.out.println("B");
    }
}

public class ConstructorCall extends B{

    public ConstructorCall(){
        // super(); A B
        System.out.println("C");
    }

    public static void main(String[] args) {
        //  new B();
        new ConstructorCall();

    }
}
