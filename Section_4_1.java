/*
(Geometry: area of a pentagon) Write a program that prompts the user to enter the length from the center of a
pentagon to a vertex and computes the area of the pentagon, as show in the following figure.
The formula for computing the area os a pentagon is Area = (5 * s^2) / (4 * tan(PI/5))
 */

// Lets user enter length from center to vertex
import java.util.Scanner;

public class Section_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the length from the center of the pentagon to a vertex in floating point data type: ");
        double midlength = sc.nextFloat();

        // Processing
        // Calculate the length of one of the sides using midlength
        double sidelength = ((2*midlength) * Math.sin(Math.PI/5));

        // Control print
        System.out.println("The one side of the sides in the pentagon is " + sidelength + " units. ");

        // Now that we have the S as referred to in the Area computation equation we can calculate the Area.
        double area = (5 * sidelength * sidelength)/(4 * Math.tan(Math.PI/5));

        // Output
        System.out.println("The area of the pentagon is " + area + " units. ");

        // The program works but the amount of decimals are horrible. Let's use what we learned in FormatDemo and
        // round it up to two digits after the decimal points as it is asked on page 173 of the 2022 Liang book.

        System.out.println("---");
        System.out.printf("The one side of the sides in the pentagon is %.2f units.\n", sidelength);
        System.out.printf("The area of the pentagon is %.2f units.\n", area);
    }
}
