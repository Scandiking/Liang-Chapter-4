/*

(Phone key pads) The international standard letter/number mapping found on the telephone is shown below:
[figure]

Write a program that prompts the user to enter a lowercase or uppercase letter and displays its corresponding number.
For a nonletter input, display invalid input.

 */

// Scanner for user input
import java.util.Scanner;

public class Section_4_15 {
    public static void main(String[] args) {
        // Create new instance of scanner object
        Scanner scanscan = new Scanner(System.in);
        // Prompt user for input
        System.out.println("Enter a letter to show its corresponding T9 button: ");
        // Save input to variable
        String userInput = scanscan.next();

        // Test if user input is 1 char length and char is letter
        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
            // if user enters a make it A (basic human client interaction)
            char letter = Character.toUpperCase(userInput.charAt(0));

            // call method of getPhoneKeyPadNumber, use letter for switch
            int number = getPhoneKeyPadNumber(letter);

            if (number != -1) {
                System.out.println("The corresponding number for letter '" + letter + "' is: " + number);
            } else {
                // If input is 1 char and isLetter but is not in switch (like æ):
                System.out.println("Invalid input");
            }
        } else {
            // if entering several symbols
                System.out.println("Invalid input. Please enter a single letter.");
            }

        // Close datastream for proper data handling
            scanscan.close();
        }

        public static int getPhoneKeyPadNumber(char letter) {
            switch (letter) {
                case 'A': case 'B': case 'C': return 2;
                case 'D': case 'E': case 'F': return 3;
                case 'G': case 'H': case 'I': return 4;
                case 'J': case 'K': case 'L': return 5;
                case 'M': case 'N': case 'O': return 6;
                case 'P': case 'Q': case 'R': case 'S': return 7;
                case 'T': case 'U': case 'V': return 8;
                case 'W': case 'X': case 'Y': case 'Z': return 9;
                default: return -1;
            }
        }
    }