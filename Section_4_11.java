/*
(Binary to decimal) Write a program that prompts the user to enter binary digits and displays its corresponding decimal
value.
 */
import java.util.Scanner;

public class Section_4_11 {
    public static void main(String[] args) {

        // Instantiate new Scanner object
        // Call it scanscan
        Scanner scanscan = new Scanner(System.in);

        // Prompt user to enter binary digits inform about limitations
        System.out.println("Enter binary digits (0000 to 1111): ");

        // Save input to RAM
        String binary = scanscan.next();

        // Cast input to type
        int decimal = Integer.parseInt(binary, 2);

        // Inform user
        System.out.println("The decimal value of binary " + binary + " is: " + decimal);

        // Close data stream for proper handling
        scanscan.close();
    }
}
