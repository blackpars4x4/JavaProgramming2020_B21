package day30_ReturnMethods;

public class UniqueElements {


    public static void main(String[] args) {
        String str = "aaabbbcccddghhhtewttt";
        String unique = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);
            int count = frequency(str, str.charAt(i));
            if (count == 1) {
                unique += each;
            }

        }
        System.out.println(unique);

    }

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
}
