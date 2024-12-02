// To read user input, scan the terminal
import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        // Generate a lottery string using math, 00 - 99
        String lottery = "" + (int) (Math.random() * 10) + (int)(Math.random() * 10);
        // Instantiate  a new scanner object, call it skanner
        Scanner skanner = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Enter your lottery pick (two digits): ");
        // Save the user input to string called guess
        String guess = skanner.nextLine();

        // Single out the string lottery variable chars using its indexes
        // The first lottery digit is the char at index 0
        char lotteryDigit1 = lottery.charAt(0);
        // The second lottery digit is the char at index 1
        char lotteryDigit2 = lottery.charAt(1);

        // Do the same for the guess char
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        // Print out the lottery number
        System.out.println("The lottery number is: " + lottery);

        // If say lottery number is 24 and user guessed 24...
        if (guess.equals(lottery))
            // ... print exact match
            System.out.println("Exact match: you win $10,000");
        // if say lottery number is 24 and user guessed 42, user matches all digits, just not right order
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        // if say lottery number is 24 and user guessed say 84 or 43 or 21, one digit in the lottery number and one digit in the guess is found in common
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            // if lottery number is 24 and user guessed 11, no digit matches
            System.out.println("Sorry, no match");
    }

}
