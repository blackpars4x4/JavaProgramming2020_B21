package day11_MultiBranchIf;

public class MaxMin2 {

    public static void main(String[] args) {
        int n1 = 10000;
        int n2 = 200;
        int n3 = 30;

        int max1 = 0;

        if(n1 > n2 && n1 > n3){  // if n1 is greater than both n2&n3
            max1 = n1;
        }else if(n2 > n1 && n2 > n3){ // if n2 is greater than both n1&n3
            max1 = n2;
        }else{ // if n1 & n2 are not maximum, then n3 is
            max1 = n3;
        }
        System.out.println("Max1: "+max1);


        int max2 = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3 ;
        System.out.println("Max2: "+max2);

        System.out.println("=====================================================");
        int min1 = 0 ;

        if(n1 < n2 && n1 < n3){
            min1 = n1;
        }else if(n2 < n1 && n2 < n3){
            min1 = n2;
        }else{
            min1 = n3;
        }

        System.out.println("Min1: "+min1);

        int min2 = (n1 < n2 && n1 < n3) ? n1 :(n2 < n1 && n2 < n3)? n2 : n3;
        System.out.println("Min2: "+min2);

    }

}

/*
3. write a program that can find the maximum number between three different numbers
			first solution: multi-branch if
			second solution: do not use any if statement


	4. write a program that can find the minimum number between three different numbers
			first solution: multi-branch if
			second solution: do not use any if statement
 */
