package day17_Strings;

public class String_Length {

    public static void main(String[] args) {
        String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";
        String s2 = "word";

        System.out.println(s.length()); // 45
        System.out.println(s2.length()); // 4
        int len = s.length();

        System.out.println(len == s2.length()); // 45 == 4 -> false
        System.out.println(len == s.length()); // 45 == 45 true

    }
}
