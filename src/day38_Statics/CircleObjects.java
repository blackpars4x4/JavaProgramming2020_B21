package day38_Statics;

public class CircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.setInfo(5);

        System.out.println(circle1);

        // circle1.equals()

        Circle circle2 = new Circle();
        circle2.setInfo(5);

        System.out.println(circle2);

        System.out.println(circle1 == circle2);
        System.out.println( circle1.equals(circle2)   );



    }

}
