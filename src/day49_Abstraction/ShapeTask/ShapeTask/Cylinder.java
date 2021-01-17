package day49_Abstraction.ShapeTask.ShapeTask;

public class Cylinder extends Shape implements Volume{

    public double r, d, h;
    public final static double PI = 3.14;

    public Cylinder(double r, double h) {
        super("Cylinder");
        if( r<= 0 || h <=0){
            throw new RuntimeException("No such a cylinder with radius and height of "+r+" "+h);
        }
        this.r= r;
        d = r * 2;
        this.h = h;
    }


    @Override
    public double area() {
        return 2*PI*r*(r+h);
    }

    @Override
    public double perimeter() {
        return new Circle(r).perimeter()*h;
    }

    @Override
    public double volume() {
        return new Circle(r).area() * h;
    }

    public String toString() {
        return "Shape{" +
                "name= '" + name + '\'' +
                ", area= '" + area() + '\'' +
                ", perimeter= '" + perimeter() + '\'' +
                '}';
    }
}
