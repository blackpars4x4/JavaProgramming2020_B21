package day33_ArrayList;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "passWord#7";

        boolean atLeast8Chars = password.length() > 8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigits = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i <= password.length() - 1; i++) {
            char each = password.charAt(i); // each character of password
            if (Character.isUpperCase(each)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(each)) {
                hasLowerCase = true;
            } else if (Character.isDigit(each)) {
                hasDigits = true;
            } else {
                hasSpecialChar = true;
            }
        }

        boolean isValid = atLeast8Chars && hasUpperCase && hasLowerCase && hasDigits && hasSpecialChar;

        System.out.println("The password validation is: " + isValid);
    }
}
