import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication results for values from 6 to 9
        int[] multiplicationResult = new int[4];

        // Calculate the multiplication table for numbers 6 to 9
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (6 + i);
        }

        // Display the results
        System.out.println("Multiplication Table for " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }

    }
}
