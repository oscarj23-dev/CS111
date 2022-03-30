import java.io.*;
/*
 The binarySearch method performs a binary search
 on a random access binary file of short values. 
 randomAccessFile file pointer to search.
 first - The first element in the search range.
 last - The last element in the search range.
 value - The value to search for.
 Return The subscript of the value if found, otherwise -1.
 */

/**
 *
 * Oscar Maldonadk
 * 3/6/2022 
 *
 */
public class BinaryRecursiveSearch {

    public static long binarySearch(
        RandomAccessFile randomAccessFile, long first, long last, short value) throws IOException {
        last = 2*value;
        long mid = (first + last)/2;
        randomAccessFile.seek(mid);
        short pos = randomAccessFile.readShort();
        //base case
        if (first >= last) { 
            return -1;
        }
        //if the value is found print the value and the position it was found at
        if(mid == value) {
            System.out.println("Value " + value + " was found at position " + pos);
            return mid;
        //if the value is less than mid the value is in the left half, make a recursive call to focus on left half
        } else if(value < mid) {
            return binarySearch(randomAccessFile, first, mid - 1, value);
        //else  make a recursive call to focus on right half
        } else {
            return binarySearch(randomAccessFile, mid + 1, last, value);
        }
    }
}