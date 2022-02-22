// File: BankAccountException.java
// Author: Tatiana Harrison <harrisont@cwu.edu>
// Last Updated: 9 February 2016
// Description: VERY Simple custom Error class, that extends Exception


public class BankAccountException extends Exception {

    public BankAccountException(String error) {
        super("Invalid Bank Account info : " + error);
    }

}
//C:\Users\oscar\Desktop\CS111\RobotFactory.java