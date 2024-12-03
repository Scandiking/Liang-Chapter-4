/*
(Find the unicode of the character) Write a program that receives a character and displays it in Unicode.
 */

// Scanner to read user input
import java.util.Scanner;

public class Section_4_9 {
    public static void main(String[] args) {
        // Prompt user for symbol
        System.out.println("Enter the character you want to see in unicode: ");

        // Instantiate new scanner object
        // Let's call it scanscan
        Scanner scanscan = new Scanner(System.in);

        // Save the user input as char datatype and take char @ index 0 if entered several symbols
        char character = scanscan.next().charAt(0);

        // cast the char datatype enter to integer datatype
        int unicodeCode = (int) character;

        // print the int
        System.out.println("The unicode code is " + unicodeCode);

        // close the datastream
        scanscan.close();

    }
}
