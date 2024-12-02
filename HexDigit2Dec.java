// Scanner to read user input
import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args) {
        // Instantiate new scanner object, call it skanner
        Scanner skanner = new Scanner(System.in);
        // Prompt the user
        System.out.print("Enter a hex digit: ");
        // Save user input in hexString
        String hexString = skanner.nextLine();

        // Check if the hex string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            // Avslutter JVM
            System.exit(0);
        }

        // Display decimal value for the hex digit, lowercase a-f gets .toUpperCase
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        }
        // We don't need to convert integers 0-9
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        }
        // If input else than a-f (which gets converted to A-F or 0-9, lets user know input is invalid.
        else {
            System.out.println(ch + " is an invalid input");
        }
        // 0 =  0
        // 1 =  1
        // 2 =  2
        // 3 =  3
        // 4 =  4
        // 5 =  5
        // 6 =  6
        // 7 =  7
        // 8 =  8
        // 9 =  9
        // A = 10
        // B = 11
        // C = 12
        // D = 13
        // E = 14
        // F = 15
    }
}
