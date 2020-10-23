package day04_Variables;

public class CalculateCircle {

    public static void main(String[] args) {
        // r: 15
        double r = 15;

        double pi = 3.14;

        double area =  r * r * pi;
        double perimeter = 2 * r * pi;

        System.out.println("Area of the circle is: ");
        System.out.println(area);

        System.out.println("Perimeter of the circle is: ");
        System.out.println(perimeter);


    }


}


/*
 write a program that can calulate the area and permeter of the circle based on the given radius


     	Hints: Area of circle = r * r * PI
     		  Perimeter of circle = 2 * r * PI
 */