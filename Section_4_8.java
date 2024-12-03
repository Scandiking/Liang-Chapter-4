/*

(Find the character of an ASCII code) Write a program that receives a character
and displays its ASCII code (an integer between 0 and 127).

*/

// Lets user enter symbol
import java.util.Scanner;

public class Section_4_8 {
    public static void main(String[] args) {
        // Create scanner object instance
        Scanner scanscan = new Scanner(System.in);
        System.out.println("Enter a character you want to see in ASCII code: ");

        // Picks the first character if user enters several. "Hello" will choose "H".
        char ascii = scanscan.next().charAt(0);
        // Confirms which symbol the system will use
        System.out.println("The character you entered is \"" + ascii + "\"");

        // Casts the symbol to int type
        // JRE will handle symbols >127.
        int asciiCode = (int) ascii;

        // Tells user what ASCII code given symbol is for.
        System.out.println("THe ASCII code for '" + ascii + "' is: " + asciiCode);

        // Closes datastream for proper handling.
        scanscan.close();

    }
}
