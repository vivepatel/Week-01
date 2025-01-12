
import java.util.Scanner;

public class ArrayInputSum {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Define an array of size 10 to store double values
        double[] numbers = new double[10];

        // Variables for tracking the sum and index
        double total = 0.0;
        int index = 0;

        // Infinite loop to take user input
        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");
        while (true) {
            // Take user input
            double num = scanner.nextDouble();

            // Check for termination conditions
            if (num <= 0 || index == 10) {
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = num;
            index++;
        }

        // Calculate the total sum using a loop
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all entered numbers
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        // Display the total sum
        System.out.println("Total sum of entered numbers: " + total);
		
    }
}

