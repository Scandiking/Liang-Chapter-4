/*

(Convert letter grade to number) Write a program that prompts the user to enter a letter grade A, B, C, D or F and
displays its corresponding numeric value 4, 3, 2, 1, or 0. For other input, display invalid grade.

*/

// To read user input
import java.util.Scanner;

public class Section_4_14 {
    public static void main(String[] args) {
        // Create new instance of scanner object
        // Name it scanscan
        Scanner scanscan = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the letter grade you want to convert to a numeric value: ");
        // Save user input as string to variable named input
        String input = scanscan.next();

        // Check if length of input == 1
        if (input.length() == 1) {
            // Take first character of user input and uppercases it. If it is A, B, C, D, F:
            char grade = Character.toUpperCase(input.charAt(0));

            switch (grade) {
                case 'A':
                    System.out.println("The numeric value for grade A is 4.");
                    break;
                case 'B':
                    System.out.println("The numeric value for grade B is 3.");
                    break;
                case 'C':
                    System.out.println("The numeric value for grade C is 2.");
                    break;
                case 'D':
                    System.out.println("The numeric value for grade D is 1.");
                    break;
                case 'F':
                    System.out.println("The numeric value for grade F is 0.");
                    break;
                    // If it is a single character but isn't one of the case characters:
                default:
                    System.out.println("Invalid grade.");
            }
        } else {
            // If it is several characters:
            System.out.println("Invalid input. Please enter a single letter grade.");
        }

        // Close scanner object for proper data stream handling
        scanscan.close();

    }
}
