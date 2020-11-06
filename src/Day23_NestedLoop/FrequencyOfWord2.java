package Day23_NestedLoop;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentence = "Java Java java java";

        String word = "java";


        String temp = sentence.toLowerCase();//"java java java java"
        int count = 0;

        while(temp.contains("java")){

            temp = temp.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);

    }
}
