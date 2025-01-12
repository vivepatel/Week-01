import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize variables
        int sum = 0;             // To store the sum of cubes of digits
        int originalNumber = number;  // Store the original number
        int digit;                // Variable to store the digit at each step

        // Use while loop to iterate through each digit of the number
        while (originalNumber != 0) {
            digit = originalNumber % 10;    // Find the last digit of the number
            sum += digit * digit * digit;   // Add the cube of the digit to sum
            originalNumber /= 10;            // Remove the last digit
        }

        // Check if the sum of cubes of digits equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
