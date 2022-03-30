//Oscar Maldonado
//Tatiana Harrison
//Homework 4
//CS111
import java.util.*;
public class CalcExponentRecursive {
    public static void main(String[] args ){
        Scanner console = new Scanner(System.in);
        System.out.print("What is the base? ");
        int base = console.nextInt();
        System.out.print("What is the exponent? ");
        int expo = console.nextInt();
        int result = calc(base, expo); 
        System.out.println(base + " raised to the power of " + expo + " is: " + result);
    }
//calculates exponent through recursion
    public static int calc(int x, int y) {
        if (y != 0) {
            return (x * calc(x, y-1));
        } else {
            return 1;
        }
    }
}
