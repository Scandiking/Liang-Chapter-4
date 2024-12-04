/*

(Check substring position) Write a program that prompts the user to enter two strings, and reports whether the second string begins the first string.

*/

// To enter strings
import java.util.Scanner;

public class Section_4_22 {
    public static void main(String[] args) {
        // Create new instance of scanner object
        Scanner scanscan = new Scanner(System.in);

        // Prompt user for first string
        System.out.print("Enter the first string: ");

        // Save first string to string datatype variable
        String firstString = scanscan.nextLine();

        // Prompt user for second string
        System.out.print("Enter the second string: ");

        // Save second string to string datatype variable
        String secondString = scanscan.nextLine();

        // Using the startsWith method and using secondString as argument
        // If this booleans to true ...
        if (firstString.startsWith(secondString)) {
            // ... confirm for user:
            System.out.println("The second string begins the first string.");
        } else {
            // If it does not:
            System.out.println("The second string does not begin the first string.");
        }

        // Close datastream
        scanscan.close();
    }
}
