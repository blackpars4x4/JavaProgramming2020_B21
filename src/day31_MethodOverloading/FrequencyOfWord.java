package day31_MethodOverloading;

import library.StringUtility;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "Today is a great day, today we are learning java, today we have java class today today";

        int count = StringUtility.frequencyOfWord(str, "today");

        System.out.println(count);

        String str2 = "java JAVA jAvA c#, C#, c# java java";
        int countJava = StringUtility.frequencyOfWord(str2, "java");
        int countCSharp = StringUtility.frequencyOfWord(str2, "c#");

        System.out.println("countJava = " + countJava);
        System.out.println("countCSharp = " + countCSharp);

        System.out.println("==============================================================");

        String sentence = "dog dog dog Dog DOG doG cat cat cat CAT";
        int countDog = StringUtility.frequencyOfWord(sentence, "dog");
        int countCat = StringUtility.frequencyOfWord(sentence, "cat");

        System.out.println("countDog = " + countDog);
        System.out.println("countCat = " + countCat);

        System.out.println( countCat == countDog );


    }
}
/*
Task1:
		1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
				Ex:
					str = "Java java java python python"
					word = "java";
					frequencyOfWord(str, word) ==>  3
 */