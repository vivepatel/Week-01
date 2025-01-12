import java.util.Random;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for students
        double[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for each student
    public static double[][] generateScores(int numStudents) {
        Random random = new Random();
        double[][] scores = new double[numStudents][3];  // 2D array: [numStudents][PCM scores]

        // Generate random scores for each student in Physics, Chemistry, and Math
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90);  // Physics score (random 2-digit number)
            scores[i][1] = 10 + random.nextInt(90);  // Chemistry score
            scores[i][2] = 10 + random.nextInt(90);  // Math score
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(double[][] scores) {
        double[][] results = new double[scores.length][4];  // 2D array: [numStudents][Total, Average, Percentage]

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];  // Total = Physics + Chemistry + Math
            double average = total / 3;  // Average
            double percentage = (total / 300) * 100;  // Percentage (out of 300 marks)

            // Round off the values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display the scorecard with scores, total, average, and percentage in a tabular format
    public static void displayScorecard(double[][] scores, double[][] results) {
        // Display the header
        System.out.println("Scorecard:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");

        // Loop through each student to display their scores and results
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n",
                i + 1,
                scores[i][0], scores[i][1], scores[i][2],
                results[i][0], results[i][1], results[i][2]);
        }
    }
}
