package Day27_ForEachLoop;

public class UniqueIntegers {

    public static void main(String[] args) {

        int[] arr = {1,1,1,4,5,6,6,7,7};

        for(int j=0; j<=arr.length-1;j++){

            int element = arr[j];
            int frequency = 0;
            for(int i=0; i <= arr.length-1; i++){

                if(arr[i] == arr[j]){
                    frequency++;
                }
            }
            if(frequency == 1){
                System.out.print(element+" ");
            }
        }
    }
}
