package day30_ReturnMethods;

public class UniqueElements {


    public static void main(String[] args) {
        String str = "aaabbbcccddghhhtewttt";
        String unique = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);
            int count = frequency(str, each);
            if (count == 1) {
                unique += each;
            }

        }
        System.out.println(unique);

        System.out.println("===================================================");

        String word = "ababcdedeh";

        String result1 = unique(word);
        System.out.println(result1);

    }


    //METHODS==========================================================================

    //                                  "aaabc" ,   'a'  ==> 3
    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {// each: a, a, a, b, c
            if (each == ch) {
                count++;
            }
        }

        return count;
    }

    public static String unique(String str) {
        String unique = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);
            int count = frequency(str, each);
            if (count == 1) {
                unique += each;
            }
        }
        return unique;
    }
}
