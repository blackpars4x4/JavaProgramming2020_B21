package day41_Enclapsulation;

public class Circle {

    private double radius, diameter, area, perimeter;
    private final static double PI;

    static{
        PI = 3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    private double calculateArea(){
        return radius * radius * PI;
    }

    private double calculatePerimeter(){
        return diameter * PI;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public static double getPI() {
        return PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }
}
/*
Task:
	create a custom class called Circle
		private variables:
			radius, diameter, PI, area, perimeter
		add a constructor to set all fields
		generate getter for all private fields
		private methods:
			calculateArea, calculatePerimeter
		public methods:
			toString
			equals(): accepts a circle object and returns true if the given argument
			circle is equal to the current circle object
 */
