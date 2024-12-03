/*
(Geometry: Area of a five-pointed star) The area of a five-pointed star can be computed using the following formula
(r is the radius of the inscribing circle):

area = 10 * ( ((TAN( ((PI)/(10)) ))/(3 - TAN( ((PI)/(10)) ) * TAN( ((PI)/(10)) ))) )* r^(2) // WolframAlpha formatting

Write a program that prompts the user to enter the radius of the inscribing circle and displays its area.
 */

// Scanner to let user enter radius
import java.util.Scanner;

public class Section_4_4 {
    public static void main(String[] args) {
        // Instantiate new scanner object, call it skanskan
        Scanner skanskan = new Scanner(System.in);
        // Prompt the user
        System.out.println("Enter the radius of the circle inscribing the star: ");
        // INPUT
        // Take user input and put it to a variable
        double radius = skanskan.nextDouble();

        // CALCULATE
        // Calculate using the formula
        double area = (10 * (Math.tan(Math.PI / 10)) / (3 - Math.tan(Math.PI/10) * Math.tan(Math.PI / 10)) * Math.pow(radius, 2));

        // OUTPUT
        // Display its area
        System.out.println("The area of the star is " + area);

    }
}
