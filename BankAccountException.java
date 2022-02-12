// File: BankAccountException.java
// Author: Tatiana Harrison <harrisont@cwu.edu>
// Last Updated: 9 February 2016
// Description: VERY Simple custom Error class, that extends Exception


public class BankAccountException extends Exception {

    public BankAccountException(String error) {
        super("Invalid Bank Account info : " + error);
    }

    public static boolean isValid(String accountLine) throws BankAccountException {
        int count = 0;
        String[] token = accountLine.split(";");
        if(token.length == 2) {
            count++;
        } else {
            throw new BankAccountException("Not properly formatted, must be 10 digit number followed by a name");
        }
        if(token[0].length() == 10) {
            count++;
        } else {
            throw new BankAccountException("bank account number not long enough, must be 10 digits.");
        }
        for(char c : token[1].toCharArray()) {
            if(!Character.isDigit(c)) {
                int count2 = 0;
                count2++;
                if(count2 == token[1].length() && token[1].length() >= 3) {
                    count++;
                } else {
                    throw new BankAccountException("There cannot be any digits in your name or it must be longer than 3 characters.");
                }
            } else { 
                throw new BankAccountException("There cannot be any digits in your name");
            }
        }
        if(count == 3) {
            return true;
        }
        return false;
    }
}
//C:\Users\oscar\Desktop\CS111\RobotFactory.java