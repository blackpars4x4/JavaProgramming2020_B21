package day07_UnaryOperators;

public class EvenlyDivisibility {

    public static void main(String[] args) {

        int number = 30;

        int remainderOf2 = number % 2; //1
        boolean divisibleBy2 = remainderOf2 < 1;
                                // 1   <  1

        int remainderOf3 = number % 3; // 2
        boolean divisibleBy3 = remainderOf3 < 1;
                //                2 < 1

        int remainderOf5 = number % 5; //0
        boolean divisibleBy5 =  remainderOf5 < 1;
                            //        0     <   1

        System.out.println(number+" is divisible by 2: "+divisibleBy2);
        System.out.println(number+" is divisible by 3: "+divisibleBy3 );
        System.out.println(number+" is divisible by 5: "+divisibleBy5);



    }


}


/*
2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5
			Ex:
				number = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */