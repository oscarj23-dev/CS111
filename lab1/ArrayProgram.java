//Oscar Maldondo
//Tatiana Morris
//1/15/22
//CS111
import java.util.*;
public class ArrayProgram {
    public static void main(String[] args) {
        ArrayProcessor arr = new ArrayProcessor();
        Random r = new Random();
        int[] n =  new int[3];
        
        for(int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(101);
        }
        arr.printThreeArray(n);
        int[] sorted = arr.sortThreeArray(n);
        arr.printThreeArray(sorted);
        int[] revSorted = arr.reverseThreeArray(sorted);
        arr.printThreeArray(revSorted);
        // int[] sorted = arr.reverseThreeArray(n);
        // System.out.println(Arrays.toString(sorted));
    }
}
