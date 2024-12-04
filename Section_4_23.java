/*

(Loyalty card and discount) Write a program that reads the following information and prints discount information for the
customer's loyalty card at the local cafe:

- Customer's name
- Number of coffees bought in total
- Coffee price
- Standard discount rate (e.g. 15%)
- Mailing list member discount rate (e.g. 3%)

*/

// Scanner to read user input
import java.util.Scanner;

public class Section_4_23 {
    public static void main(String[] args) {
    // INPUT
        // Create new scanner instance
        // Name it scanscan
        Scanner scanscan = new Scanner(System.in);

        // prompt user for input
        System.out.println("Enter customer's name: ");
        // Save input
        String customerName = scanscan.nextLine();

        // Prompt user for input
        System.out.println("Enter the number of coffees bought in total: ");
        // Save input as integer datatype variable
        int numberOfCoffees = scanscan.nextInt();

        // Prompt user for input
        System.out.println("Enter the average price of coffee: ");
        // Save price as double datatype (for e.g. $3.5)
        double coffeePrice = scanscan.nextDouble();

        // Prompt user for input
        System.out.println("Enter the standard discount rate (e.g., 0.15 for 15%): ");
        // Save input as double datatype variable
        double standardDiscountRate = scanscan.nextDouble();

        // Prompt user for input
        System.out.print("Enter the mailing list member discount rate (e.g., 0.03 for 3%): ");
        // Save user input as double datatype variable
        double mailingListDiscountRate = scanscan.nextDouble();

    // CALCULATIONS
        // Calculate discounts
        double totalCost = numberOfCoffees * coffeePrice;
        double standardDiscount = totalCost * (standardDiscountRate/100);
        double mailingListDiscount = totalCost * (mailingListDiscountRate / 100);
        double totalDiscount = standardDiscount + mailingListDiscount;
        double finalCost = totalCost - totalDiscount;

    // OUTPUT
        System.out.println("\n--- Discount information ---");
        System.out.println("Customer Name: " + customerName);
        // Sets format specifier to 2 because these are monetary units
        System.out.printf("Total cost before discounts: $%.2f\n", totalCost);
        System.out.printf("Standard discount: $%.2f\n", standardDiscount);
        System.out.printf("Mailing list Member discount: $%.2f\n", mailingListDiscount);
        System.out.printf("Total Discount: $%.2f\n", totalDiscount);
        System.out.printf("Final cost after discount: $%.2f\n", finalCost);

    }
}
