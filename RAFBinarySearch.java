import java.io.*;
import java.util.*;
/*
 * random access binary file recursive binary search
 * This program demonstrates the recursiv
 * binary search method applied to random access binary file.
 * 
 * I pledge that I have neither given nor received help from anyone other than
 * the instructor or TAs for all program components included here.
 * 
 * Oscar Maldonado
 * 3/6/2022
 *
 */
public class RAFBinarySearch {
    public static void main(String[] args) 
        throws FileNotFoundException, IOException {
        //open file
        File binFile = new File("/Users/oscarmaldonado/Desktop/helloworld.java/CS111/BinFileShort");
        Scanner console = new Scanner(System.in);
        //create random access file object in read mode with file passed in
        RandomAccessFile raf = new RandomAccessFile(binFile, "r");
        //prompt user what value to look for
        System.out.print("Enter the number you're looking for: ");
        short value = console.nextShort();

        //try the recursive call and catch any excpetions
        try {
            BinaryRecursiveSearch.binarySearch(raf, 0, 4999, value);
        } catch(IOException E) {
            System.out.println("Value was not found");
        } 
    }
}