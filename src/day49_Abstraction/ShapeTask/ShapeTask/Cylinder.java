package day49_Abstraction.ShapeTask.ShapeTask;

public class Cylinder extends Shape implements Volume{

    private double r, d, h;
    public final static double PI = 3.14;

    public Cylinder(double r, double h) {
        super("Cylinder");
        if( r<= 0 || h <=0){
            throw new RuntimeException("No such a cylinder with radius and height of "+r+" "+h);
        }
        setR( r );
        setD(  r * 2  );
        setH( h );
    }

    @Override
    public double area() {
        return 2*PI *r*(r + h);
    }

    @Override
    public double perimeter() {
        return new Circle(r).perimeter() * h;
    }

    @Override
    public double volume() {
        return new Circle(r).area() * h;
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

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
