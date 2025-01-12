import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            System.out.println("Invalid age entered.");
            return false; 
        } else if (age >= 18) {
            return true; 
        } else {
            return false; 
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        int[] studentAges = new int[10]; // Array to store ages of 10 students

        // Input and processing
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is NOT eligible to vote.");
            }
        }

        
    }
}
