package Day46_JavaRecap.ShapeTask;

public class Circle extends Shape{

    private double r, d;
    private final static double PI=3.14;

    public Circle(double r) {
        super("Circle");
        if(r <= 0) {//if the radius of circle is invalid
            throw new RuntimeException("No Such a Circle with a radius of: "+ r);
        }
        setR(r);
        setD(r * 2);

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

    @Override
    public double area() {
        return r * r * PI;
    }

    @Override
    public double perimeter() {
        return d * PI;
    }
}
