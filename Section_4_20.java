/*

(Process a string) Write a program that prompts the user to enter a string and display its
length and its last character.

*/

// For user input
import java.util.Scanner;

public class Section_4_20 {
    public static void main(String[] args) {
        // Create new instance of scanner object
        Scanner scanscan = new Scanner(System.in);
        // primpt user for input
        System.out.println("Enter the string: ");

        // Save input to variable
        String str = scanscan.nextLine();

        // Count length of str
        int strlength = str.length();
        // save char at strlength minus 1
        char strLast = str.charAt(strlength - 1);

        // Inform user
        System.out.println("The length of the string " + "\"" + str + "\"" + " is " + strlength + " symbols.");
        System.out.println("The last character of the string is: " + strLast);

    }
}
