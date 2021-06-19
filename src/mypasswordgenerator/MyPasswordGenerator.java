package mypasswordgenerator;

import java.util.Random;
import java.util.Scanner;

/**
 * MyPasswordGenerator.java
 * The project generates strong passwords for your social media.
 * @version 1.0 6/3/21
 * @author cristianalvarezsv
 */
public class MyPasswordGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length = 0; Scanner sc = new Scanner(System.in);
        System.out.print("Type how many characters do you want for your password: ");length = Integer.parseInt((sc.nextLine()));
        if(length >= 6) System.out.println("Your new password: "+String.copyValueOf(generate(length)));
        else System.out.println("The password must be at least 6 characters.");
    }
    
    /**
     * @param length it is the size for the password.
     * @return a a char array as new password.
     */
    static char[] generate(int length) {
        String charsCaps = "ABCDFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_=+-";
        String passSymbols = charsCaps;
        //
        Random rnd = new Random();
        //
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            password[i] = passSymbols.charAt(rnd.nextInt(75));
        }
        return password;
    }
}
