package Day26_Arrays;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "I love java, java is a cool programming language and java is more useful javascript";

        String[] arr = sentence.split(" ");

        int countJava = 0;
        int countPython = 0;

        for( int i = 0; i <= arr.length-1; i++){

            String eachWord = arr[i];
            if(eachWord.toLowerCase().contains("java")){
                countJava++;
            }
            if(eachWord.toLowerCase().contains("python")){
                countPython++;
            }
        }
        System.out.println("Java: " + countJava);
        System.out.println("Python: " + countPython);


        System.out.println("=================================================");

        String[] words = {"C#", "Java","C#","Python", "Ruby", "Swift", "C++", "Swift"};

        //find unique words !!!!!!


    }
}
