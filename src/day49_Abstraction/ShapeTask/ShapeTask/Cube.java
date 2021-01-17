package day49_Abstraction.ShapeTask.ShapeTask;

public class Cube extends Shape implements Volume  {
    public double side;
    public Cube(double side) {
        super("Cube");
        if(side <= 0){
            throw  new RuntimeException("No such a cube with side of "+side);
        }
        this.side = side;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name= '" + name + '\'' +
                ", area= '" + area() + '\'' +
                ", perimeter= '" + perimeter() + '\'' +
                '}';
    }
}
