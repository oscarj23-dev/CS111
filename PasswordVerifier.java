//Oscar Maldonado
//Tatiana Morris
//1/29/2022
//CS111

public class PasswordVerifier {
    private static int minLength = 8;

    //Runs throught all methods and checks to see if they are all valid
    public static boolean isValid(String str) {
        boolean valid = true;
        int counter = 0;
        if (str.length() <= minLength) {
            System.out.println("Your password must be atleast 8 characters.");
        } else {
            counter++;
        }
        if (!hasDigit(str)) {
            System.out.println("Your password must contain a digit.");
        } else {
            counter++;
        }
        if (!hasLowerCase(str)) {
            System.out.println("Your password must have a lowercase letter");
        } else {
            counter++;
        } 
        if(!hasUpperCase(str)) {
            System.out.println("Your password must have an uppercase letter.");
        } else {
            counter++;
        }
        if (counter == 4) {
            System.out.println("Your password has been set.");
            return valid;
        } else {
            return !valid;
        }
    }

    //checks if the string cotains any uppercase chars, returns false if it does not.
    public static boolean hasUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        };
        return false;
    }

    //checks if the string cotains any lowercase chars, returns false if it does not.
    public static boolean hasLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //checks if the string cotains any digits, returns false if it does not.
    public static boolean hasDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}