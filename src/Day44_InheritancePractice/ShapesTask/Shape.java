package Day44_InheritancePractice.ShapesTask;

public class Shape {
    public String name;
    public final static boolean isShape, hasArea, hasPerimeter; // constant


    public Shape(String name){
        this.name=name;
    }
    /*public void setInfo(String name){
        this.name=name;
    }*/

    static{
        isShape = true;
        hasArea = true;
        hasPerimeter = true;
    }

    public double calcArea(){
        return 0;
    }


    public double calcPerimeter(){
        return 0;
    }


    public String toString() {
        return "Shape{" +
                "name= '" + name + '\'' +
                ", Area= '" + calcArea() + '\'' +
                ", Perimeter= '" + calcPerimeter() + '\'' +
                '}';
    }



}

/*
1. create a class called Shape
						variables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
						methods: setInfo, calcArea(), calcPerimeter()
								 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()
 */
