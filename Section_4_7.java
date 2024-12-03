/*
(Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point at the 0 o' clock position, as shown
in the figure 4.4c. Write a program that prompts  the user to enter the radius of the bounding circle of a pentagon and
displays the coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use console format to
display two digits after the decimal point.
 */

import java.util.Scanner;

public class Section_4_7 {
    public static void main(String[] args) {
        Scanner skannskann = new Scanner(System.in);
        System.out.println("Enter the radius of the bounding circle: ");
        double radius = skannskann.nextDouble();

        // Calculate and display the coordinates of the pentagon's corners
        System.out.println("The coordinates of the pentagon are: ");
        for (int i = 0; i < 5; i++) {
            double angle = i * 2 * Math.PI / 5 - Math.PI / 2;
            double x = radius * Math.cos(angle);
            double y = radius * Math.sin(angle);

            System.out.printf("P%d: (%.2f, %.2f)%n", i + 1, x, y);
        }

        skannskann.close();


    }
}
