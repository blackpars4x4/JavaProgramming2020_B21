package day49_Abstraction.ShapeTask.ShapeTask;

public class Square extends Shape{

    public double side;

    public Square(double side) {
        super("Square");
        if(side <= 0){
            throw new RuntimeException("No such a square with side of "+side);
        }
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }
}
