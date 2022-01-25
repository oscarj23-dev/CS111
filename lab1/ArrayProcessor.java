//Oscar Maldondo
//Tatiana Morris
//1/15/22
//CS111
import java.util.*;

public class ArrayProcessor {
    
    //This method sorts the array in order from least to greatest
    public int[] sortThreeArray(int [] arr) {
        int temporary = 0;
  
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }
        return arr;
    }
    //This method reverses the order of the array
    public int[] reverseThreeArray(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        return arr;
    }
    //This method prints the contents of the array
    public void printThreeArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
