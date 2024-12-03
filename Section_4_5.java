/*

(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in which all sides are of the same length
and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for computing
the area of a regular polygon is
Area = (n * s^2) / (4 * tan(PI/n))
Here, s is the length of a side. Write a program that prompts the user to enter the number of sides and their length of
a regular polygon and displays its area.

 */

// Scanner to read user input
import java.util.Scanner;

public class Section_4_5 {
    public static void main(String[] args) {
        // Create new scanner object instant
        // Name it skannskann
        Scanner skannskann = new Scanner(System.in);

        // INPUT
        System.out.println("Enter the number of sides: ");
        double n = skannskann.nextDouble();
        System.out.println("Enter side length: ");
        double s = skannskann.nextDouble();

        // CALCULATING
        double area = ((n*Math.pow(s,2))/(4*Math.tan(Math.PI/n)));

        // OUTPUT
        System.out.println("The area of the polygon is: " + area);
    }
}
