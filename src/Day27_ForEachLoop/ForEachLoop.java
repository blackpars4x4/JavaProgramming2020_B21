package Day27_ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] name = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for (int i = 0; i <= name.length - 1; i++) {
            System.out.println((name[i]));
        }

        System.out.println("======================================");

        for (String each : name) {
            System.out.println(each);
        }

        System.out.println("======================================");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int countEvens = 0;
        int countOdds = 0;

        for (int each : numbers) {//each is the element of the array
            if (each % 2 == 0) {
                countEvens++;
            } else {
                countOdds++;
            }
        }
        System.out.println("CountOdds = " + countOdds);
        System.out.println("CountEvens = " + countEvens);

        System.out.println("=====================================");

        int[] scores = {10, 2, 3, 25, 5, 100, -5, -2, 1000, 30, 40, 56};
        int max = scores[0];
        int min = scores[0];

        for( int each : scores){
            if(each > max){
                max = each;
            }
            if(each > min){
                min = each;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
