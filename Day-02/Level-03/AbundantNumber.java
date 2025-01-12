import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Initialize sum to store the sum of divisors
        int sum = 0;

        // Loop to find divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a divisor of the number
                sum += i;  // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

    }
}
