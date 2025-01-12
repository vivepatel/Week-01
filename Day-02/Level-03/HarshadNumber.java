import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Initialize sum to store the sum of digits
        int sum = 0;
        int originalNumber = number;  // Store the original number for comparison later

        // Loop to sum the digits of the number
        while (number != 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;         // Remove the last digit
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

    }
}
