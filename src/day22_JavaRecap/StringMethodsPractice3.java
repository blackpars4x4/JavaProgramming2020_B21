package day22_JavaRecap;

import java.util.Scanner;

public class StringMethodsPractice3 {
    public static void main(String[] args) {


        String sentence = "Capital of Canada is Washington";

        /*sentence.replace("Canada", "United States");*/ // we cannot modify original string because it is immutabl
        sentence = sentence.replace("Canada", "United States");
        System.out.println(sentence);

        System.out.println("==========================");

        String s = "Cybertek School is in Boston, Cybertek Campus is in McLean";

        s=s.replaceFirst("Cybertek", "MIT");

        System.out.println(s);

        String r = "cava is cool programming language, I can learn cava at cybertek school";
        r = r.replace("cav", "jav");

        System.out.println(r);

        String p = "I like Java and Java Java Java Java Java Java";

        p=p.replaceFirst("Java", "C#");
        p=p.replaceFirst("Java", "java");
        p=p.replace("Java", "");

        System.out.println(p);

        System.out.println("=========================================" );

        // trim: removes white spaces only

        String str = "                       ";

        System.out.println(str.length());

        str = str.trim();

        System.out.println(str.length());

        String str2 = "                  Cybertek       School            ";

        System.out.println(str2);

        str2 = str2.trim();

        System.out.println(str2);

        System.out.println("===================================================");
        // contains, isEmpty, startsWith, endsWith

        String s2 = "I like to learn Java";

        System.out.println("Contains c#: " + s2.toUpperCase().contains("java"));

        System.out.println( s2.equals("java") ); // false
        System.out.println( s2.equalsIgnoreCase("java")  );  // false

        System.out.println("===================================================");

        String s3 = "Cybertek School is the best";

        System.out.println(s3.contains("cybertek"));//false
        System.out.println(s3.toLowerCase().contains("cybertek"));//true ignore case sensitivity

        System.out.println(s3.equals("cybertek")); // false
        System.out.println(s3.equalsIgnoreCase("cybertek")); // false

        System.out.println( "Java".isEmpty()  ); // false
        System.out.println("".isEmpty() );//true

        System.out.println("===================================================");
        // startsWith, endsWith

        String URL = "https://www.amazon.wer";   // .com, .gov, .edu

        boolean isValid = URL.startsWith("http") && (URL.endsWith(".com") || URL.endsWith(".edu") || URL.endsWith(".gov"));

        if(isValid){
            System.out.println("URL is valid");
        }else{
            System.out.println("Invalid");
        }
        System.out.println("=============");
        /*
        valid emails: gmail, hotmail, yahoo, outlook
         */

        String email = "Java_Master@gmail.com";

        boolean isValidEmail = email.endsWith("gmail.com") || email.endsWith("yahoo.com") || email.endsWith("hotmail.com")
                || email.endsWith("outlook.com");

        if(isValidEmail){
            System.out.println("Valid email");
        }else{
            System.out.println("Invalid email");
        }
        System.out.println("============================================");


    }
}
