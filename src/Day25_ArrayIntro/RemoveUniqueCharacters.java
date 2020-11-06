package Day25_ArrayIntro;

public class RemoveUniqueCharacters {

    public static void main(String[] args) {

        String str = "abcabd";
        String result = "";

        for(int j = 0; j < str.length(); j++){
            int count = 0;
            char ch = str.charAt(j);

            for(int i = 0; i < str.length(); i++){
                char eachChar = str.charAt(i);
                if(eachChar == ch){
                    count++;
                }
            }
            if (count > 1 ){ // && !result.contains(("" + ch))
                result +=  ch;
            }
        }

        System.out.println(result);
    }
}
