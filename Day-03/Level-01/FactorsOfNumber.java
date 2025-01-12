
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for a number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        
        // Initialize variables
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; // Index variable to track the number of factors
        
        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor
                // Check if we need to resize the array
                if (index == maxFactor) {
                    // Double the size of the factors array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    // Copy existing factors to the new array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Assign the new array to factors
                }
                factors[index] = i; // Store the factor
                index++; // Increment the index
            }
        }
        
        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println(); // New line
    }
}

