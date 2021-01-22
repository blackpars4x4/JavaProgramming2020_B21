package day49_Abstraction.ShapeTask.ShapeTask;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

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

        System.out.println(rectangle.getW());

        System.out.println("----------------------------------------------");
        // Shape shape1 = circle;
        // Shape shape2 = rectangle;
        // Shape shape3 = cylinder;
        // Shape shape4 = cube;
        // Shape shape5 = square;

        Shape[] shapes = {circle, rectangle, cube, cylinder, square, new Circle(5), new Square(3),
                new Circle(10), new Circle(15)};

        for (Shape eachShape : shapes) {
            if (eachShape.name.equals("Circle")) {
                System.out.println(eachShape);
            }
        }

        System.out.println("-------------------------------------------");

        ArrayList<Shape> circles = new ArrayList<>();
        circles.addAll(Arrays.asList(shapes));
        circles.removeIf(p -> !p.name.equals("Circle"));

        System.out.println(circles.size());

        System.out.println("-------------------------------------------------------");

        circles.forEach(p -> {
            System.out.println(p);
        });

        System.out.println("--------------------------------------------------------");


       /* for(Shape eachShape : circles){
            if(eachShape.area() > 400){
                System.out.println(eachShape);
            }
        }*/

        circles.forEach(each -> {
            if (each.area() > 400) System.out.println(each);
        });

        System.out.println("--------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //list.forEach(p -> { if (p % 2 == 0) System.out.println(p); });
        //list.forEach(p -> { if (p % 2 == 0) p * 2=2; });
        list.forEach(p -> {    });

        System.out.println(list);

        System.out.println("--------------------------------------------------------");


        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> greaterThan5 = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12));

        numbers.forEach(p -> {if(p / 2 ==0) evenNumbers.add(p); else oddNumbers.add(p);});

        numbers.forEach(p -> {if(p > 5) greaterThan5.add(p);});

        System.out.println("oddNumbers = " + oddNumbers);
        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("greaterThan5 = " + greaterThan5);


    }
}
