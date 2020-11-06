package Day26_Arrays;

public class MinNumberInArray {

    public static void main(String[] args) {

        int[] numbers = {300, 100, 400, 50, 500, 150, 170};
        int min = numbers[0];

        for(int i = 0; i <= numbers.length-1; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Min= "+min);
    }
}
