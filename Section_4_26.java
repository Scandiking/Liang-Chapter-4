/*
(Financial application: monetary units) Rewrite listing 2.10, ComputeChange.java, to fix the possible loss of
accuracy when converting a float value to an int value. Read the input as a string such as "11.56". Your program should
extract the dollar amount before the decimal point, and the cents after the decimal amount using the
indexOf and substring methods.

 */

// To read user input
import java.util.Scanner;

public class Section_4_26 {
    public static void main(String[] args) {
    // INPUT ...
        // Create new instance of scanner object
        Scanner scanscan = new Scanner(System.in);

        // prompt user for input
        System.out.print("Enter an amount in the format dollars.cents (e.g., 12.34): ");
        // save input
        String amount = scanscan.nextLine();

    // CALCULATIONS...
        int decimalIndex = amount.indexOf(".");

        // "Divide" the dollars and cents numbers
        int dollars = Integer.parseInt(amount.substring(0, decimalIndex));
        int cents = Integer.parseInt(amount.substring(decimalIndex + 1));

        // Then it's just normal math ...
        int totalCents = dollars * 100 + cents;

        int numberOfOneDollars = totalCents / 100;
        totalCents %= 100;

        int numberOfQuarters = totalCents / 25;
        totalCents %= 25;

        int numberOfDimes = totalCents / 10;
        totalCents %= 10;

        int numberOfNickels = totalCents / 5;
        totalCents %= 5;

        int numberOfPennies = totalCents;


    // OUTPUT
        System.out.println("Your amount" + amount + " consists of:");
        System.out.println(numberOfOneDollars + " dollars");
        System.out.println(numberOfQuarters + " quarters");
        System.out.println(numberOfDimes + " dimes");
        System.out.println(numberOfNickels + " nickels");
        System.out.println(numberOfPennies + " pennies");



    }
}
