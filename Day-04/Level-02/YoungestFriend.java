import java.util.Scanner;

public class YoungestFriend {

    // Method to find the youngest friend
    public static int findYoungest(int[] ages) {
        int youngest = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
        }
        return youngest;
    }

    // Method to find the tallest friend
    public static int findTallest(double[] heights) {
        int tallest = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of " + friends[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        // Find youngest and tallest
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        // Display results
        System.out.println(friends[youngest] + " is the youngest with age " + ages[youngest] + " years.");
        System.out.println(friends[tallest] + " is the tallest with height " + heights[tallest] + " cm.");

        
    }
}
