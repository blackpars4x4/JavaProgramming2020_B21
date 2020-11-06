package Day26_Arrays;

public class MaxNumberInArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        //               0,1,2,3...

        int max = numbers[0];//1

        for(int i = 1; i <= numbers.length-1; i++){
            if(numbers[i] > max){
                max = numbers [i];

            }
        }
        System.out.println("Max number: " + max);
    }
}
