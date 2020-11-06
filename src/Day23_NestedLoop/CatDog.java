package Day23_NestedLoop;

public class CatDog {
    public static void main(String[] args) {
        String sentence =  "dog dog Dog Dog cat CAT cAt";

        String temp = sentence.toLowerCase();

        int countDog = 0;
        String word = "dog";

        while(temp.contains(word)){
            temp = temp.replaceFirst(word, "");
            countDog++;
        }
        System.out.println(countDog);

        int countCat = 0;
        String word2 = "cat";

        while (temp.contains(word2)){
            temp=temp.replaceFirst(word2, "");
            countCat++;
        }
        System.out.println(countCat);
    }
}
