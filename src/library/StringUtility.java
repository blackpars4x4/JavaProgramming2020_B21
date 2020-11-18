package library;

public class StringUtility {


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

    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public static String removeDuplicate(String str) {
        String result = "";// expected result "abc"

        for (String each : str.split("")) {
            if (!result.contains(each)) {
                result += each;

            }
        }
        return result;
    }
}
