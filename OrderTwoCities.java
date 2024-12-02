import java.util.Scanner;

// "Listing 4.2 gives a program that prompts the user to enter two cities and displays them in alphabetical order"
// (Liang, 2020, p. 158)

public class OrderTwoCities {
    public static void main(String[] args) {
        // Instantiate a new scanner object
        // Let's call it skanner
        Scanner skanner = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.print("Enter the first city: ");
        String city1 = skanner.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = skanner.nextLine();

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
    }
}
