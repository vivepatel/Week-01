import java.util.Scanner;

public class CheckNumber {
    // Method to check if a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
	}
        public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // take input from the user
        System.out.println("Enter an integer:");
        int number = sc.nextInt();

        int result = checkNumber(number);

        // Output the result based on the returned value
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
 }


