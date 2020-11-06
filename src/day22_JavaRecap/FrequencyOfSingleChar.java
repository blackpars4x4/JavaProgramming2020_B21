package day22_JavaRecap;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {

        String str = "Today I learned Java Language";
        char ch = ' ';

        int count = 0;

        for(int i = 0; i <= str.length()-1; i++){

            char eachCharacter = str.charAt(i);

            if(ch == eachCharacter){
                count++;
            }

        }
        System.out.println("count= " + count);
        System.out.println("number of words: " + (count + 1)); // this is for space in the sentence



    }


}
