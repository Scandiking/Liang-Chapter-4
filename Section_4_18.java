/*
(Student major and status) Write a program that prompts the user to enter two characters and displays the major and
status represented in the characters. The first character indicates the major and the second is number character
1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following
characters are used to denote the majors:

I: Information management
C: Computer Science
A: Accounting

*/

// To read user input
import java.util.Scanner;

public class Section_4_18 {
    public static void main(String[] args) {

        // Create a new instance of the scanner object
        Scanner scanscan = new Scanner(System.in);
        // Prompt user for input
        System.out.println("Enter two characters (1st char = I, C or A), (2nd char = 1, 2, 3 or 4):" );
        // Save user input to String datatype variable called userInput
        String userInput = scanscan.nextLine();


        // Check valididity of user input
        // If input is not 2 length
        if (userInput.length() != 2) {
            // primpts user to enter input equal to two symbols
            System.out.println("Invalid input. Please enter exactly two characters.");
        } else {

            // takes input positions
            // makes letter uppercase if it is not (due to switch setup)
            // takes char at index 0
            char major = Character.toUpperCase(userInput.charAt(0));

            // takes char at index 1
            char status = userInput.charAt(1);

            // calling getMajorName method
            String majorName = getMajorName(major);
            // calling getStatusName method
            String statusName = getStatusName(status);

            // Checks if majorName and statusName contains information and prints it if it does
            if (majorName != null && statusName != null) {
                System.out.println("Major: " + majorName + ", Status: " + statusName);
                // If majorName == null tell user major is invalid
            } else if (majorName == null) {
                System.out.println("Invalid major.");
            } else {
                // For anything else
                System.out.println("Invalid status.");
            }
        }

        // Close data stream for proper resource handling
        scanscan.close();


    }

    // Afforementioned methods

    // Takes the char from major variable
    public static String getMajorName(char major) {
        // if it is I, C or A returns corresponding string
        switch (major) {
            case 'I': return "Information Management";
            case 'C': return "Computer Science";
            case 'A': return "Accounting";
            default: return null;

        }
    }

    // Takes the char from status variable
    public static String getStatusName(char status) {
        // if it is 1, 2, 3 or 4 returns corresponding string
        switch (status) {
            case '1': return "Freshman";
            case '2': return "Sophomore";
            case '3': return "Junior";
            case '4': return "Senior";
            default: return null;
        }
    }
}
