/*

(Geometry: estimate areas)
Use the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the
figure in Section 4.1 to compute the estimated area enclosed by these four cities. (Hint: use the formula in the
programming exercise 4.2 to compute the distance between two cities. Divide the polygon into two triangles and use the
formula in Programming Exercise 2.19 to compute the area of a triangle.

*/

public class Section_4_4 {
    public static void main (String[] args) {

        // INPUT
        // GPS locations:
        // Atlanta, Georgia:
        double lat_atlanta = 33.7490;
        double lon_atlanta = -84.3880;

        // Orlando, Florida
        double lat_orlando = 28.5383;
        double lon_orlando = -81.3792;

        // Savannah, Georgia
        double lat_savannah = 32.0809;
        double lon_savannah = -81.0912;

        // Charlotte, North Carolina:
        double lat_charlotte = 35.2271;
        double lon_charlotte = -80.8431;

        // PROCESSING
        // We need to convert degrees to radians (IDE convention)
        double lat_atlanta_rad = Math.toRadians(lat_atlanta);
        double lon_atlanta_rad = Math.toRadians(lon_atlanta);
        double lat_orlando_rad = Math.toRadians(lat_orlando);
        double lon_orlando_rad = Math.toRadians(lon_orlando);
        double lat_savannah_rad = Math.toRadians(lat_savannah);
        double lon_savannah_rad = Math.toRadians(lon_savannah);
        double lat_charlotte_rad = Math.toRadians(lat_charlotte);
        double lon_charlotte_rad = Math.toRadians(lon_charlotte);

        // Distance between Atlanta and Orlando
        double d_atl_orl = 6371.01 * Math.acos(Math.sin(lat_atlanta_rad) * Math.sin(lat_orlando_rad) + Math.cos(lat_atlanta_rad) * Math.cos(lat_orlando_rad) * Math.cos(lon_atlanta_rad - lon_orlando_rad));
        // Control print
        System.out.println("The distance between Atlanta and Orlando is " + d_atl_orl + " " + "kilometers.");

        // Distance between Savannah and Charlotte
        double d_sav_cha = 6371.01 * Math.acos(Math.sin(lat_savannah_rad) * Math.sin(lat_charlotte_rad) + Math.cos(lat_savannah_rad) * Math.cos(lat_charlotte_rad) * Math.cos(lon_charlotte_rad - lon_savannah_rad));
        System.out.println("The distance between Savannah and Charlotte is " + d_sav_cha + " " + "kilometers.");

        System.out.println();

    // Triangle 1 (Atlanta, Orlando, Savannah)
        System.out.println("Triangle 1:");
        // Distance between Atlanta and Orlando
        double d2_atl_orl = 6371.01 * Math.acos(Math.sin(lat_atlanta_rad) * Math.sin(lat_orlando_rad) + Math.cos(lat_atlanta_rad) * Math.cos(lat_orlando_rad) * Math.cos(lon_atlanta_rad - lon_orlando_rad));
        System.out.println("The distance between Atlanta and Orlando is " + d2_atl_orl + " " + "kilometers.");

        // Distance between Orlanda and Savannah
        double d2_orl_sav = 6371.01 * Math.acos(Math.sin(lat_orlando_rad) * Math.sin(lat_savannah_rad) + Math.cos(lat_orlando_rad) * Math.cos(lat_savannah_rad) * Math.cos(lon_orlando_rad - lon_savannah_rad));
        System.out.println("The distance between Orlando and Savannah is " + d2_orl_sav + " " + "kilometers.");

        // Distance between Savannah and Atlanta
        double d2_sav_atl = 6371.01 * Math.acos(Math.sin(lat_savannah_rad) * Math.sin(lat_atlanta_rad) + Math.cos(lat_savannah_rad) * Math.cos(lat_atlanta_rad) * Math.cos(lon_savannah_rad - lon_atlanta_rad));
        System.out.println("The distance between Savannah and Atlanta is " + d2_sav_atl + " " + "kilometers.");

    // Triangle 2 (Atlanta, Savannah, Charlotte)
        System.out.println("Triangle 2:");
        // Distance between Atlanta and Savannah
        double d3_atl_sav = 6371.01 * Math.acos(Math.sin(lat_atlanta_rad) * Math.sin(lat_savannah_rad) + Math.cos(lat_atlanta_rad) * Math.cos(lat_savannah_rad) * Math.cos(lon_atlanta_rad - lon_savannah_rad));
        System.out.println("The distance between Atlanta and Savannah is " + d3_atl_sav + " " + "kilometers.");

        // Distance between Savannah and Charlotte
        double d3_sav_cha = 6371.01 * Math.acos(Math.sin(lat_savannah_rad) * Math.sin(lat_charlotte_rad) + Math.cos(lat_savannah_rad) * Math.cos(lat_charlotte_rad) * Math.cos(lon_savannah_rad - lon_charlotte_rad));
        System.out.println("The distance between Savannah and Charlotte is " + d3_sav_cha + " " + "kilometers.");

        // Distance between Charlotte and Atlanta
        double d3_cha_atl = 6371.01 * Math.acos(Math.sin(lat_charlotte_rad) * Math.sin(lat_atlanta_rad) + Math.cos(lat_charlotte_rad) * Math.cos(lat_atlanta_rad) * Math.cos(lon_charlotte_rad - lon_atlanta_rad));
        System.out.println("The distance between Charlotte and Atlanta is " + d3_cha_atl + " " + "kilometers.");

        System.out.println();

        // Let's juse 2.19
        // s = (side1 + side2 + side3) / 2
        // area = Math.sqrt((s - side1)(s - side2)(s - side3))

        // Triangle 1
        double s1 = ((d2_atl_orl + d2_orl_sav + d2_sav_atl)/2);
        double area1 = (Math.sqrt(s1 * (s1 - d2_atl_orl) * (s1 - d2_orl_sav) * (s1 - d2_sav_atl)));

        // Triangle 2
        double s2 = ((d3_atl_sav + d3_sav_cha + d3_cha_atl)/2);
        double area2 = (Math.sqrt(s2 * (s2 - d3_atl_sav) * (s2 - d3_sav_cha) * (s2 - d3_cha_atl)));

        // OUTPUT
        System.out.println("The area between Atlanta, Orlando and Savannah (Triangle 1) is " + area1 + " square kilometers");
        System.out.println("The area between Atlanta, Savannah and Charlotte (Triangle 2) is " + area2 + " square kilometers");
        System.out.println("The combined area of area 1 at " + area1 + " square kilometers and area 2 at " + area2 + " square kilometers is " + (area1+area2) + " kilometers.");
    }
}

// Disclaimer
/*
Please note that we have used the great circle distance to measure the distance from one city to another, and then we do
not take account for the curvature when calculating the area. If you control this with AI you might see the results it
gives will differ vastly, but the assignment text specifically specifies to use the way we did it in task 2.19.

 */