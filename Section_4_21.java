/*
(Check IMEI number) Write a program that prompts a user to enter International Mobile Equipment identity (IMEI)
number in the format DD-DDDDDD-DDDDDD-D, where D is a digit. Your program should check whether the input is valid.
 */

// Scanner for user input
import java.util.Scanner;

public class Section_4_21 {

    // Helper class
    public static boolean isValidFormat(String imei) {
        // Split the input into parts using "-"
        String[] parts = imei.split("-");

        // Check if there are exactly 4 parts
        if (parts.length != 4) {
            return false;
        }

        // Validate each part (which is divided by "-")
        // Checks if first part of the IMEI (index 0) has a length of 2 or is numeric
        if (parts[0].length() != 2 || !isNumeric(parts[0])) {
            return false;
        }
        // Checks if second part of the IMEI (index 1) has a length of 6 or is numeric
        if (parts[1].length() != 6 || !isNumeric(parts[1])) {
            return false;
        }
        // Checks if third parth of the IMEI (index 2) has a length of 6 or is numeric
        if (parts[2].length() != 6 || !isNumeric(parts[2])) {
            return false;
        }
        // Checks if fourth part of the IMEI (index 3) has a length of 1 or is numeric
        if (parts[3].length() != 1 || !isNumeric(parts[3])) {
            return false;
        }

        // If everything is a-ok
        return true;
    }

    // Helper method to check if a string contains only digits
    public static boolean isNumeric(String str) {
        // For loop iterates the string and checks each part of the string (which does not contain the "-" character)
        for (char c : str.toCharArray()) {
            // if char is not a digit, this evaluates to true
            if (!Character.isDigit(c)) {
                // and exits
                return false;
            }
        }
        // Returns to true when all chars are evaluated as digits
        return true;
    }

    public static void main(String[] args) {
        // Create new instance of the scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the IMEI number (format DD-DDDDDD-DDDDDD-D): ");
        // Save user input to string datatype variable
        String imei = scanner.nextLine();

        // Validate the format using the helper function
        if (isValidFormat(imei)) {
            // Confirm validity for user
            System.out.println("The IMEI number format is valid.");
        } else {
            // Confirm invalidity for user
            System.out.println("The IMEI number format is invalid.");
        }

        // Close data stream
        scanner.close();
    }
}

