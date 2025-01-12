import java.util.Scanner;

public class TrigonometricFunctions {
    // Method to calculate trigonometric functions (sine, cosine, tangent) for an angle in degrees
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double angle_Radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent using Math class methods
        double sine = Math.sin(angle_Radians);
        double cosine = Math.cos(angle_Radians);
        double tangent = Math.tan(angle_Radians);

        // Return the results as an array: [sine, cosine, tangent]
        return new double[] { sine, cosine, tangent };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from the user
        System.out.println("Enter the angle in degrees:");
        double angle = sc.nextDouble();

        // Create an object of TrigonometricFunctions to call the method
        TrigonometricFunctions calculator = new TrigonometricFunctions();

        // Calculate the trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Output the results for sine, cosine, and tangent
        System.out.println("Sine of the angle: " + results[0]);
        System.out.println("Cosine of the angle: " + results[1]);
        System.out.println("Tangent of the angle: " + results[2]);
    }

    
}
