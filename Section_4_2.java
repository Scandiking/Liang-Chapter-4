/*

(Geometry: great circle distance) The great circle distance is the distance between two points on the
surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points.
The great circle distance between the two points can be computed using the following formula:

d = radius * arccos(sin (x_1) * sin(x_2) + cos(x_1) * cos(x_2) * cos(y_1 - y_2))

Write a program that prompts the user to enter the latitude and longitude of two points on earth in degrees and
displays its great circle distance. The average radius of the earth is 6.371,01 km. Note you need to convert the
degrees into radians using the Math.toRadians method since Java trigonometric methods use radians. The latitude and
longitude degrees in the formula are for north and west. Use negative to indicate south and east degrees.

*/

// Let user input latitude and longitude of two points
import java.util.Scanner;

public class Section_4_2 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);

        // INPUT
        System.out.println("Enter latitude for point 1:");
        double lat1 = skanner.nextFloat(); // equals x1

        System.out.println("Enter longitude for point 1:");
        double lon1 = skanner.nextFloat(); // equals y1

        System.out.println("Enter latitude for point 2:");
        double lat2 = skanner.nextFloat(); // equals x2

        System.out.println("Enter longitude for point 2:");
        double lon2 = skanner.nextFloat(); // equals y2

        double radius = 6371.01;

        // Convert degrees to radians
        double lat1rad = Math.toRadians(lat1);
        double lon1rad = Math.toRadians(lon1);
        double lat2rad = Math.toRadians(lat2);
        double lon2rad = Math.toRadians(lon2);

        // Control print
        System.out.println("PUNKT 1: \n" + "Latitude:\n" + lat1 + "\n" + "Longitude:\n" + lon1 + "\n" + "PUNKT 2: \n" + "Latitude:\n" + lat2 + "\n" + "Longitude:\n" + lon2 );

        // PROCESSING
        double distance = radius * Math.acos(Math.sin(lat1rad) * Math.sin(lat2rad) + Math.cos(lat1rad) * Math.cos(lat2rad) * Math.cos(lon1rad - lon2rad)
        );

        // OUTPUT
        // Let's also limit it two digits after the decimal point
        System.out.printf("\nThe great circle distance is %.2f km.%n", distance);
    }
}
