import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {

    // Method to generate random ages for n students
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(100); // Generate random age between 0 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            eligibility[i][0] = String.valueOf(ages[i]); // Store age as String
            if (ages[i] < 0) {
                eligibility[i][1] = "Cannot Vote"; // Negative age
            } else if (ages[i] >= 18) {
                eligibility[i][1] = "Can Vote"; // Eligible to vote
            } else {
                eligibility[i][1] = "Cannot Vote"; // Not eligible to vote
            }
        }
        return eligibility;
    }

    // Method to display the 2D array in a tabular format
    public static void displayEligibility(String[][] eligibility) {
        System.out.printf("%-10s %-15s%n", "Age", "Voting Eligibility");
        System.out.println("---------------------------");
        for (String[] row : eligibility) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students (up to 10): ");
        int numberOfStudents = scanner.nextInt();

        // Validate the number of students
        if (numberOfStudents < 1 || numberOfStudents > 10) {
            System.out.println("Please enter a valid number of students (1-10).");
            return;
        }

        // Generate random ages for the students
        int[] ages = generateRandomAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the results
        displayEligibility(eligibility);
    }
}