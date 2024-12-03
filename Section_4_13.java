/*
(Vowel or consonant?) Write a program that prompts the user to enter a letter and check whether the letter is a
vowel or consonant. For a nonletter input, display invalid input.
 */

// Scanner for user input
import java.util.Scanner;

public class Section_4_13 {
    public static void main (String[] args) {
        // Create new scanner instance
        Scanner scanscan = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a letter to check whether it is a vowel or consonant: ");
        // Save userInput to variable of String datatype
        String userInput = scanscan.next();

        // Check if the input is a single character and a letter
        if (userInput.length() == 1 && Character.isLetter(userInput.charAt(0))) {
            char letter = Character.toLowerCase(userInput.charAt(0));

            // Check if the letter is a vowel (vowels not here will default to consonant like æ ø å)
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
            // if one enters numbers or more than one character
        } else {
            System.out.println("Invalid input.");
        }

        // CLose data stream for handling
        scanscan.close();

    }
}
