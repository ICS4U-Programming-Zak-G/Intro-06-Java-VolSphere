// Import scanner class to get input.
import java.util.Scanner;

/** .
* This program calculates the volume of a sphere
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-02-11
*/

// Creating class
public final class VolSphere {
    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private VolSphere() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) {
        // Welcome and get user input
        System.out.println("This program calculates the area of a sphere.");
        System.out.println("Enter the radius (cm): ");

        // Using scanner to get user input
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        // Convert string to float
        final float radiusFloat = Float.parseFloat(radString);

        // Check if input is negative
        if (radiusFloat < 0) {
            // If negative, tell user
            System.out.println(radiusFloat + " is negative.");
        } else {
            // Calculate volume
            final double volume = (4d / 3d) * (Math.PI * Math.pow(radiusFloat, 3));

            // Print result to user and round
            System.out.print("The volume of the sphere is: ");
            System.out.format("%.3f", volume);
            System.out.println("cm^2.");
        }

        // Close scanner
        scanner.close();

    }
}
