package Day44_InheritancePractice.ShapesTask;

public class Cube extends Shape {

    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;
        // setInfo("Cube");
    }

    @Override
    public double calcArea() {
        // Square square = new Square(side);//one square of the cube
        // double area = square.calcArea(); // area of one square

        return side * side * 6;
    }

    @Override
    public double calcPerimeter() {
        return side * 12;
    }
}
