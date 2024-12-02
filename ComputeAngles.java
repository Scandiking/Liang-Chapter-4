// Program to compute the angles of a triangle

// Import Scanner object to let user enter the three points of the triangle
import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        // Instantiate a new Scanner-object, let's call it skanner
        Scanner skanner = new Scanner(System.in);

        // Prompt the user to enter the x, y coordinates of the triangle
        System.out.print("Enter three points: ");
        // Enter the x coordinate of the first point
        double x1 = skanner.nextDouble();
        // Enter the y coordinate of the first point
        double y1 = skanner.nextDouble();
        // Enter the x coordinate of the second point
        double x2 = skanner.nextDouble();
        // Enter the y coordinate of the second point
        double y2 = skanner.nextDouble();
        // Enter the x coordinate of the third point
        double x3 = skanner.nextDouble();
        // Enter the y coordinate of the third point
        double y3 = skanner.nextDouble();

        // Compute length of n side
        // Distance formula
        // a is the distance of points x2, y2 and x3, y3
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        // b is the distance of points x1, y1 and x3, y3
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        // c is the distance of points x1, y1 and x2, y2
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        // Compute three angles (cosinus formula)
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        // Display results
        System.out.println("The three angles are " + Math.round(A * 100) / 100.0 + ", " + Math.round(B * 100) / 100.0 + " and " + (Math.round(C * 100) / 100.0) + ".");

    }
}
