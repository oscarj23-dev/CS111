//Oscar Maldonado
//Tatiana Morris
//1/29/2022
//CS111

import java.util.*;
public class PasswordDemo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = console.nextLine();
        PasswordVerifier.isValid(password);
    }
}