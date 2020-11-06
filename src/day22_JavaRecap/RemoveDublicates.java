package day22_JavaRecap;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "abcabc";
        String result = ""; // "abc"

        for(int i = 0; i <= str.length()-1; i++ ){

            String eachCharacter = ""+str.charAt(i); // a, b, c, a, b, c,  gets each of the character one by one

            if(result.contains(eachCharacter)){ // if the character is already contained in the result, we will skip that character
                continue;
            }else{ // if the character  is not contained in the result yet, then we concate the character
                result += eachCharacter;
            }

            /*
            if(!result.contains(eachCharacter)){
                result += eachCharacter;
            }
             */

            //  result += (!result.contains(eachCharacter))? eachCharacter : "";

        }

        System.out.println("result = " + result);
    }
}
