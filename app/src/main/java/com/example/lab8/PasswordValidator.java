package com.example.lab8;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumberCase = false;
        boolean hasLengthCase = false;
        int i = 0;
        for (char c : password.toCharArray()) {
            i++;
            if (i >= 10){
                hasLengthCase = true;
            }
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isDigit(c)){
                hasNumberCase = true;
            }
            // If both conditions are met, the password is valid
            if (hasUpperCase && hasLowerCase && hasLengthCase && hasNumberCase) return true;
        }
        return false;
    }
}