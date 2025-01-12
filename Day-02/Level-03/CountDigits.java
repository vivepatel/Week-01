import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Create a variable count to store the number of digits
        int count = 0;

        // Use a while loop to count digits
        while (number != 0) {
            number /= 10;  // Remove the last digit
            count++;       // Increment the digit count
        }

        // Display the number of digits
        System.out.println("The number of digits is: " + count);
    }
}
