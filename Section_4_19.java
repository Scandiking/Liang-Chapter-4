/*
(Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the ISBN number as a string.
 */

// For user input
import java.util.Scanner;


public class Section_4_19 {
    public static void main(String[] args) {
        // Instantiate new scanner object
        Scanner scanscan = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the first 9 digits of the ISBN as a string: ");

        // Save to user input to string datatype variable
        String isbn = scanscan.next();

        // Test validity of input
        // If input != 9 chars, print invalid message
        if (isbn.length() != 9) {
            System.out.println("Invalid ISBN. The ISBN must be exactly 9 digits.");
            // Checks that string inputs contains only 9 digits, negated by the !
            // so if it does not, prints msg to user
        } else if (!isbn.matches("\\d{9}")) {
            System.out.println("Invalid input. The ISBN must contain only digits.");
        } else {
            int checksum = 0;
            for (int i = 0; i < 9; i++) {
                checksum += (isbn.charAt(i) - '0') * (i + 1);
            }
            checksum %= 11;

            String isbn10 = isbn + (checksum == 10 ? "X" : checksum);

            System.out.println("The ISBN-10 number is: " + isbn10);
        }


        // Closes data stream for proper handling
        scanscan.close();



    }
}
