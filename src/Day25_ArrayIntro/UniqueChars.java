package Day25_ArrayIntro;

public class UniqueChars {

    public static void main(String[] args) {


        String str = "abcababe";

        String result = "";

        for (int j = 0; j < str.length(); j++) {// j represents the index num of str
            char ch = str.charAt(j);//'a'
            int count = 0;

            for (int i = 0; i < str.length(); i++) {// i represent the index num of str

                char eachChar = str.charAt(i);// each characters of str
                if (eachChar == ch) {
                    count++;
                }
            }// count the frequency of ch

            if (count == 1) {// if the frequency is one, it means it's unique
                result += ch;
            }

        }
        System.out.println(result);
    }

}
