package day33_ArrayList;

public class WrapperClassPractice {

    public static void main(String[] args) {
        String str = "a1b2c3d4";  // 1: 49,  2: 50, 3: 51
        int sum = 0;

        for (int i = 0; i <= str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i))) {  // to verify if each char in string is a digit
                sum += Integer.parseInt("" + str.charAt(i));  // each digits need to be converted to integer and added to the sum
            }
        }


        System.out.println("sum = " + sum);

        System.out.println("====================================================");
        String password = "passWord#7";

        String upperLetters = "";
        String lowerLetters = "";
        String digits = "";
        String specialChar = "";

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {// verify if the charcter is upper case
                upperLetters += each;
            } else if (Character.isLowerCase(each)) {
                lowerLetters += each;
            } else if (Character.isDigit(each)) {// verify if the charcater is digit
                digits += each;
            } else {//' special character
                specialChar += each;
            }

        }
        System.out.println("upperLetters = " + upperLetters);
        System.out.println("lowerLetters = " + lowerLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);

        boolean isValid = password.length() >= 8
                        && upperLetters.length() > 0
                        && lowerLetters.length() > 0
                        && digits.length() > 0
                        && specialChar.length() > 0;
        System.out.println(isValid);

    }

}

/*
3. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
4. Password validation
    1. 8 character at least
    2. there must be a digit            (isUpper   isLowercase)
    3. there must be a letter (at least one upper case & one lower case)
    4. there must be special character
 */

