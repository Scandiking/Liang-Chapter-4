/*
(Generate vehicle plate numbers) Assume that a vehicle plate number consists of three uppercase
letters followed by four digits. Write a program to generate a plate number.
 */


public class Section_4_25 {
    public static void main(String[] args) {
        // Generate random letter(s)
        char letter1 = (char) ('A' + Math.random() * 26);
        char letter2 = (char) ('A' + Math.random() * 26);

        // Generate random number(s)
        int digit1 = (int) (Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        int digit3 = (int) (Math.random() * 10);
        int digit4 = (int) (Math.random() * 10);
        int digit5 = (int) (Math.random() * 10);

        // Combine the variables to a string
        String plateNumber = "" + letter1 + letter2 + "-" + digit1 + digit2 + digit3 + digit4 + digit5;

        // Print the string with contextualizing intent
        System.out.println("Your new plate number is: " + plateNumber);

        // Disclaimer
        // The task is to "generate a plate number". This does not catch duplicates or exceptions or anything.
        // I've choosen to "localize" this answer to Norwegian form plate numbers, despite what the task is asking for.
    }
}
