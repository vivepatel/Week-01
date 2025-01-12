import java.util.Scanner;

public class FootballTeamHeights {

    public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println(" Enter the height of the 11 Player between 150 to 250");
		
        int[] heights = new int[11]; // Generate random heights for 11 players
        for(int i=0;i<heights.length;i++)
		{
			System.out.println(" Enter the height of the " + (i+1) );
			heights[i]=input.nextInt();
		}

        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Sum of heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
    }


    // Method to display the heights
    public static void displayHeights(int[] heights) {
        System.out.println("Heights of the players (in cms):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int sum, int totalPlayers) {
        return (double) sum / totalPlayers;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
