import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for point 1 (x1, y1)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Input for point 2 (x2, y2)
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the two points: " + distance);

        // Calculate the equation of the line
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];
        System.out.println("Equation of the line: y = " + slope + "x + " + intercept);
    }

    // Method to calculate Euclidean distance
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Euclidean distance formula: distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate the slope (m) and y-intercept (b) of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        // Slope formula: m = (y2 - y1) / (x2 - x1)
        double slope = (y2 - y1) / (x2 - x1);

        // Y-intercept formula: b = y1 - m * x1
        double intercept = y1 - slope * x1;

        // Return the slope and intercept as an array
        return new double[]{slope, intercept};
    }
}
