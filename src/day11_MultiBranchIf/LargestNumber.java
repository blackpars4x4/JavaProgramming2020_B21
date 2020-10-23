package day11_MultiBranchIf;

public class LargestNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 300;
        int n3 = 400;

        boolean n1IsMax = n1 > n2 && n1 > n3;
        boolean n2IsMax = n2 > n1 && n2 > n3;

        if( n1IsMax  ){
            System.out.println("first number is the maximum number: "+n1);
        }else if( n2IsMax  ){
            System.out.println("second number is the maximum number: "+n2);
        }else{
            System.out.println("Third Number is the maximum number: "+n3);
        }



    }

}
