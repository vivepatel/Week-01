import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop from 1 to number-1 to find the factors
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a factor of number
                System.out.println(i);  // Print the factor
            }
        }
    }
}
