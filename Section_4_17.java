/*
(Days of a month) Write a program that prompts the user to enter the year and the first three letters of a month name
(with the first letter in uppercase) and displays the number of days in the month. If the input for month is incorrect,
display a message as presented in the following sample runs.
 */

// For user input
import java.util.Scanner;

public class Section_4_17 {
    public static void main(String[] args) {

        // Instantiate new scanner object
        Scanner scanscan = new Scanner(System.in);

        // Prompts user for input
        System.out.print("Enter a yeear:  ");

        // Save user input as integer
        int year = scanscan.nextInt();

        // Prompt user for more input
        System.out.println("Enter the first three letters of a month (e.g., Jan): ");

        // Save user input as string
        String month = scanscan.next();

        // call method
        int days = getDaysInMonth(year, month);


        if (days != -1) {
            System.out.println(month + " " + year + " has " + days + " days.");
        } else {
            // basic error handling if user enters nothing in list (jan is definitely not wrong from a user perspective.
            // But "." is.
            System.out.println("Invalid month name.");
        }

        // Close data stream for proper data handling
        scanscan.close();

    }

    // getDaysInMonth method
    public static int getDaysInMonth(int year, String month) {
        month = month.toLowerCase();

        // if enters "jan" returns 31 because jan has 31 days
        switch (month) {
            case "jan": return 31;
            // special case feb, lets call isLeapYear method and use year argument
            case "feb": return isLeapYear(year) ? 29 : 28;
            case "mar": return 31;
            case "apr": return 30;
            case "may": return 31;
            case "jun": return 30;
            case "jul": return 31;
            case "aug": return 31;
            case "sep": return 30;
            case "oct": return 31;
            case "nov": return 30;
            case "dec": return 31;
            default: return -1;
        }
    }

    // How to find out if {year} is leap year?
    public static boolean isLeapYear(int year) {
        // Take given year mod by 4 and it equals 0 AND year mod by 100 NOT 0 OR year mod 400 IS 0 is true yes is leap
        // year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
