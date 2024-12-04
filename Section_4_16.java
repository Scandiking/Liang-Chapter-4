/*
(Random character) Write a program that displays a random lowercase letter using the Math.random() method.
 */

public class Section_4_16 {
    public static void main(String[] args) {

        // basic ASCII values = 97 (a) - 122 (z)
        // Take math.random number times 26, make this an integer and cast it to a char datatype and
        // save this char datatype to the variable letter
        char letter = (char) ((int) (Math.random() * 26) + 'a');

        // Display the random letter to the user who asked for it
        System.out.println("Random letter: " + letter);
    }
}
