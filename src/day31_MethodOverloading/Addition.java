package day31_MethodOverloading;

public class Addition {
    public static void main(String[] args) {


    }
    public static int additionOf2Numbers(int a, int b){
        return a+b;
    }

    public static int additionOf3Numbers(int a, int b, int c){
        return additionOf2Numbers(a, b) + c;
    }

    public static int additionOf4Numbers(int a, int b, int c, int d){
        return additionOf2Numbers(a, b) + additionOf2Numbers(c, d);
    }

}
/*
Task2:
		1. create a method that can find the addition of two numbers
					method name: additionOf2Numbers
		2. create a method that can find the addition of three numbers
			        method name: additionOf3Numbers
		3. create a method that can find the addition of four numbers
					method name: additionOf4Numbers
 */