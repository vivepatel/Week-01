import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        // Create a double array to hold the heights of 11 players
        double[] heights = new double[11];
        Scanner scanner = new Scanner(System.in);
        
        // Get input values from the user
        System.out.println("Enter the heights of 11 players (in meters):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }
        
        // Calculate the sum of all heights
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        
        // Calculate the mean height
        double meanHeight = sum / heights.length;
        
        // Print the mean height
        System.out.printf("The mean height of the football team is: %.2f meters%n", meanHeight);

    }
}