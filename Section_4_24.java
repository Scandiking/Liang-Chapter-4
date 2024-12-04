/*

(Enter three countries) Write a program that prompts the user to enter three countries and
displays them in descending order.

*/

// Scanner for user input
import java.util.Scanner;

public class Section_4_24 {
    public static void main(String[] args) {

        // Create new instance of scanner object
        Scanner scanscan = new Scanner(System.in);

        // User help text
        System.out.println("Enter three countries.");

        // Prompt user for input
        System.out.println("Enter the first country: ");
        // Save input
        String country1 = scanscan.nextLine();

        // Prompt user for input
        System.out.println("Enter the second country: ");
        // Save input
        String country2 = scanscan.nextLine();

        // Prompt user for input
        System.out.println("Enter the third country: ");
        // Save input
        String country3 = scanscan.nextLine();

        // Create array to store countries in
        String[] countries = {country1, country2, country3};

        // Use Arrays sort method (this is ascending order)
        java.util.Arrays.sort(countries);

        // Re-list countries so that third country [2] in ascending order from
        // Arrays.sort method comes first [0] in the index
        String[] descendingCountries = {countries[2], countries[1], countries[0]};

        // Print output for user
        System.out.println("\nCountries in alphabetically descending order: ");
        for (String country : descendingCountries) {
            System.out.println(country);
        }

        // Close datastream
        scanscan.close();

    }
}
