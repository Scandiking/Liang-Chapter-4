/*
(Random points on a circle) Write a program that generate three random points on a circle centered at (0, 0) with
radius 40 and displays three angles in a triangle formed by these three points, as shown in Figure 4.4a. Display the
angles in degrees. (Hint: Generate a random angle a in radians between 0 and 2PI, as shown in Figure 4.4b and the point
determined by this angle is r^x_cos(a), r^x_sin(a).)
 */

public class Section_4_6 {
    public static void main(String[] args) {

        // INPUT
        // Limit circle
        double radius = 40;

        // CALCULATE
        double angle1 = Math.random() * 2 * Math.PI;
        double angle2 = Math.random() * 2 * Math.PI;
        double angle3 = Math.random() * 2 * Math.PI;

        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        double angleA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double angleB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b));

        angleA = Math.toDegrees(angleA);
        angleB = Math.toDegrees(angleB);
        angleC = Math.toDegrees(angleC);

        // OUTPUT
        System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Point 2: (" + x2 + ", " + y2 + ")");
        System.out.println("Point 3: (" + x3 + ", " + y3 + ")");

        System.out.println("Angle A: " + angleA + " degrees");
        System.out.println("Angle B: " + angleB + " degrees");
        System.out.println("Angle C: " + angleC + " degrees");

        System.out.println("Sum of angles " + (angleA + angleB + angleC) + " degrees");
    }
}
