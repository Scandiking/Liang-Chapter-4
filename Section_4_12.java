/*

(Hex to binary) Write a program that prompts the user to enter a hex digit and displays its corresponding binary
number in four digits. For example, hex digit 7 is 0111 in binary. Hex digits can be entered either in uppercase or
lowercase. For an incorrect input, display invalid input.

*/

// Scanner to scan terminal for input
import java.util.Scanner;

public class Section_4_12 {
    public static void main(String[] args) {
        // Instantiate new scanner object
        // Call it scanscan
        Scanner scanscan = new Scanner(System.in);
        // Prompt user to enter a hex digit
        System.out.println("Enter a hex digit: ");

        // Save hex digit to ram in hexInput variable String datatype
        String hexInput = scanscan.next();

        // Basic error handling
        // If hexInputs length is 1 and isValidHexDigit, cast it with radix 16
        if (hexInput.length() == 1 && isValidHexDigit(hexInput.charAt(0))) {
            char hexDigit = hexInput.charAt(0);
            int decimalValue = Character.digit(hexDigit, 16);
            // Format the output
            String binaryValue = String.format("%4s", Integer.toBinaryString(decimalValue)).replace(' ', '0');
            // let user know result
            System.out.println("The binary value of hex digit " + hexDigit + " is " + binaryValue);
        // if input is not 1 symbol length or not A-F, a-f or 0-9:
        } else {
            System.out.println("Invalid hex digit. Please enter a single hex digit (0-9, A-F or a-f).");
        }

        // Close data stream for proper handling
        scanscan.close();


    }

    public static boolean isValidHexDigit(char ch) {
        return (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
    }
}
