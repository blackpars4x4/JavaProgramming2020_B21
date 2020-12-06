package day32_LocalDate_WrapperClass;

public class CharacterWrapperClass {
    public static void main(String[] args) {

        char n = '8';

        System.out.println(Character.isDigit(n));
        System.out.println(Character.isLetter(n));

        String str = "a1b2c3b5c5d6T@w$y%o^p%";

        String digits = "";
        String letter = "";
        String specialChar = "";

        for (char each : str.toCharArray()){
            if(Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letter += each;
            }else{
                specialChar += each;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters= "+ letter);
        System.out.println("speacial char= "+specialChar);

    }
}

/*
Password validation
1. 8
 */
