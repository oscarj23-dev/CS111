import java.util.*;
import java.io.*;
public class BankAccountProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("What is the file name: ");
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        ///Users/oscarmaldonado/Desktop/helloworld.java/CS111/accountsFile.txt
        File file = new File(input);
        Scanner scan = new Scanner(file);
        boolean runProgram = true;

        while(runProgram) {
            try {
                while(scan.hasNextLine()) {
                    isValid(scan.nextLine());
                }
            }   catch(BankAccountException e) { 
                System.out.println(e.getMessage());
                System.out.print("Would you like to continue? ");
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
    public static boolean isValid(String accountLine) throws BankAccountException {
        int count = 0;
        int count2 = 0;
        String[] token = accountLine.split(";");
        if(token.length == 2) {
            count++;
        } else {
            throw new BankAccountException("Not properly formatted, must be 10 digit number followed by a name.");
        }
        if(token[0].length() == 10) {
            count++;
        } else {
            throw new BankAccountException("bank account number not long enough, must be 10 digits.");
        }
        for(char c : token[0].toCharArray()) {
            if(!Character.isDigit(c)) {
                throw new BankAccountException("Bank account number should not contain any characters.");
            }
        }
        for(char c : token[1].toCharArray()) {
            if(Character.isDigit(c)) {
                throw new BankAccountException("There cannot be any digits in your name.");
            } else {
                count2++;
            }
            if(count2 == token[1].length()) {
                count++;
            }
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
