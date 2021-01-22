package day49_Abstraction.ShapeTask.ShapeTask;

import org.w3c.dom.ls.LSOutput;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(23);
        Rectangle rectangle = new Rectangle(10, 20);
        Cube cube = new Cube(15);
        Cylinder cylinder = new Cylinder(2, 5);
        Square square = new Square(5);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(square);

        System.out.println(circle.getR());


    }
}
