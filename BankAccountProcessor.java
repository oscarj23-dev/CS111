//Oscar Maldonado
//2/22/2022
//Tatiana Harris
//CS112
import java.util.*;
import java.io.*;
public class BankAccountProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("What is the file name: ");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        //creates a New scanner to take in user input and a new file object
        File file = new File(input);
        Scanner scan = new Scanner(file);
        boolean runProgram = true;
        
        //while loop set to run while runProgram is true
        while(runProgram) {
            try {   
                //try if there is another line in the file and check if it is valid
                if(scan.hasNext()) {
                    System.out.println(scan.nextLine());
                    isValid(scan.nextLine());
                } else { 
                    runProgram = false;
                }
            }   catch(BankAccountException e) { 
                //catch any exceptions thrown by isValid method
                System.out.println(e.getMessage());
                System.out.print("Would you like to continue? ");

                //asks user if they want to continue or not
                String answer = console.nextLine();
                if(answer.startsWith("n") || answer.startsWith("N")) {
                    runProgram = false;
                } else {
                    runProgram = true;
                }
            }
            //System.out.println("end of while loop");
        }
    }

    private static boolean isValid(String accountLine) throws BankAccountException {
        int count = 0;
        int count2 = 0;
        String[] token = accountLine.split(";");
        //checks if string is properly formatted
        if(token.length == 2) {
            count++;
        } else {
            throw new BankAccountException("Not properly formatted, must be 10 digit number followed by a name.");
        }
        //checks if account number is 10 digits long
        if(token[0].length() == 10) {
            count++;
        } else {
            throw new BankAccountException("bank account number not long enough, must be 10 digits.");
        }
        //checks if there are any  letters in the account number
        for(char c : token[0].toCharArray()) {
            if(!Character.isDigit(c)) {
                throw new BankAccountException("Bank account number should not contain any characters.");
            }
        }
        //checks if there are any letters in account name
        for(char c : token[1].toCharArray()) {
            if(Character.isDigit(c)) {
                throw new BankAccountException("There cannot be any digits in your name.");
            } else {
                count2++;
            }
            if(count2 == token[1].length()) {
                count++;
            }
            //checks if name is greater than 3 chars
            if(token[1].length() <= 3) {
                throw new BankAccountException("Username must be greater than 3 characters.");
            }
        } 
        if(count == 3) {
            return true;
        }
        return false;
    }
}
