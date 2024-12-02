public class FormatDemo {
    public static void main(String[] args) {
        // Display the header of the table
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

        /*
        % indicates the start of a format specifier.
        - left-aligns the output in the specified width. By default the output is right-aligned (which makes sense for numbers, but this is for strings in a header)
        precision (which in this case is 10), max width for strings. If we put more three chars into string "Degrees" we have used all the available "slots" for chars
        s specifies data type, which in this case is a string
        */


        // Display value for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        /*
        % indicates the start of a format specifier.
        - left-alignes the output in the specified width (10).
        d indicates integer datatype.
        .4f indicates a formatting of 4 decimals
        %-10d prints degrees as a left-aligned integer in a 10 char wide field
        %-10.4f prints radians, sin, cos and tan values as left-aligned floating-point numbers with 4 decimal places in 10 char wide fields
         */

        // Display values for 60 degrees
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}
