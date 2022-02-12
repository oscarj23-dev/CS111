import java.util.*;
import java.io.*;
public class BankAccountProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("What is the file name: ");
        Scanner console = new Scanner(System.in);
        ///Users/oscarmaldonado/Desktop/helloworld.java/CS111/accountsFile.txt
        String file = console.nextLine();
        Scanner scan = new Scanner(file);
        boolean runProgram = true;

        while(runProgram) {
            try {
                while(scan.hasNextLine()) {
                    BankAccountException.isValid(scan.nextLine());
                }
                runProgram = false;
            }   catch(BankAccountException e) { 
                System.out.println("An exception happened, would you like to continue?");
            }
        }
    }
}
