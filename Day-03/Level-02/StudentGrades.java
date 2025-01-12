import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// Number of students and subjects
        final int numberOfStudents = 5; // You can change this to any number of students
        final int numberOfSubjects = 3; // Physics, Chemistry, Maths
		// 2D array to store marks of students
        int[][] marks = new int[numberOfStudents][numberOfSubjects];
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];
		// Input marks for each student
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            System.out.println("Enter marks for Student " + (studentIndex + 1) + ":");
            for (int subjectIndex = 0; subjectIndex < numberOfSubjects; subjectIndex++) {
                while (true) {
                    System.out.print(subjects[subjectIndex] + ": ");
                    marks[studentIndex][subjectIndex] = scanner.nextInt();
                    if (marks[studentIndex][subjectIndex] < 0 || marks[studentIndex][subjectIndex] > 100) {
                        System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    } else {
                        break;
                    }
                }
            }
        }
		// Calculate percentage and grade for each student
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            int totalMarks = 0;
            for (int subjectIndex = 0; subjectIndex < numberOfSubjects; subjectIndex++) {
                totalMarks += marks[studentIndex][subjectIndex];
            }
            percentages[studentIndex] = (double) totalMarks / numberOfSubjects;
			// Determine grade based on percentage
            if (percentages[studentIndex] >= 90) {
                grades[studentIndex] = 'A';
            } else if (percentages[studentIndex] >= 80) {
                grades[studentIndex] = 'B';
            } else if (percentages[studentIndex] >= 70) {
                grades[studentIndex] = 'C';
            } else if (percentages[studentIndex] >= 60) {
                grades[studentIndex] = 'D';
            } else {
                grades[studentIndex] = 'F';
            }
        }
		// Display the results
        System.out.println("\nResults:");
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            System.out.printf("Student %d: Percentage = %.2f%%, Grade = %c%n", (studentIndex + 1), percentages[studentIndex], grades[studentIndex]);
        }
	}
}