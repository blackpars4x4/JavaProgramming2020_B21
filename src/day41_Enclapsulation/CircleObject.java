package day41_Enclapsulation;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle = new Circle(4);

        /*System.out.println(circle.area);*/

        System.out.println(circle.getDiameter());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println("==========================================");

        circle.setRadius(5);
        System.out.println(circle.getDiameter());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());


    }


}
