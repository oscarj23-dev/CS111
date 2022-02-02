// File: LessNaiveEncryption.java
// Author: Oscar Maldonado
//
// Description: The skeleton of a program that uses split method
// and a StringBuilder objects to reverse the letters of each word,
// but which keeps the order of the words the same. For example:
import java.util.Scanner;

public class LessNaiveEncryption {
   public static void main(String[] args) {

    //user input is taken from the command line
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Provide a sentence to encrypt: ");
      String userInput = keyboard.nextLine();

    //the input is then split on " "
      String[] formatted = userInput.split(" ");
      System.out.print("The encrypted sentence is: ");
   
    //using the string builder class each token is reversed
      for(String a : formatted) {
         StringBuilder str = new StringBuilder(a);
         System.out.print(str.reverse() + " ");
      }
      System.out.print("\n");
   }
}