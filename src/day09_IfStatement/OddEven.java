package day09_IfStatement;

public class OddEven {

    public static void main(String[] args) {
        int number = 1000;

        boolean even =   number%2 == 0;

        if(even){
            System.out.println(number+" is even number");
        }

        if(!even ){
            System.out.println(number+" is odd number");
        }




    }


}


/*
1. write a program that can check if the given number is odd or even (OddEven)
		Ex:
			number = 100;
			output:
				100 is even number

			number = 101
			output:
				101 is odd number
 */