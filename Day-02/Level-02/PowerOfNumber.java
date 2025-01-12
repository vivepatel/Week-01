import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the base number and the power (exponent) from the user
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power (exponent): ");
        int power = input.nextInt();

        // Variable to store the result, initially set to 1
        int result = 1;

        // Loop from 1 to power to calculate the power of the number
        for (int i = 1; i <= power; i++) {
            result *= number;  // Multiply the result by the number in each iteration
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);   
    }
}
