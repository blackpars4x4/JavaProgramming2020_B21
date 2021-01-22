package day49_Abstraction.ShapeTask.ShapeTask;

public class Cube extends Shape implements Volume  {
    private double side;
    public Cube(double side) {
        super("Cube");
        if(side <= 0){
            throw  new RuntimeException("No such a cube with side of "+side);
        }
        setSide(side);
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double area() {
        Square square =new Square(side);
        return square.area() * 6;
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name= '" + name + '\'' +
                ", area= '" + df.format(area() ) + '\'' +
                ", perimeter= '" + df.format(perimeter()) + '\'' +
                ", volume= '" + df.format( volume() ) + '\'' +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
