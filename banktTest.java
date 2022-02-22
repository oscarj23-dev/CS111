import java.util.*;
import java.io.*;
public class banktTest {
    public static void main(String[] args) throws FileNotFoundException, BankAccountException {
        System.out.print("What is the file name: ");
        Scanner console = new Scanner(System.in);
        ///Users/oscarmaldonado/Desktop/helloworld.java/CS111/accountsFile.txt
        String Dile = console.nextLine();
        File file = new File("/Users/oscarmaldonado/Desktop/helloworld.java/CS111/accountsFile.txt");
        Scanner scan = new Scanner(file);
        boolean runProgram = true;
        int i = 0;

        while(runProgram) {
            try {
                while(scan.hasNextLine()) {
                    BankAccountProcessor.isValid(scan.nextLine());
                }
            }   catch(BankAccountException e) { 
                System.out.println(e.getMessage());
                System.out.print("Would you like to continue? ");

            }//runProgram = false;
        }
    }
}
