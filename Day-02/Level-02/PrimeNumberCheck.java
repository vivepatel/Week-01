import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Initialize isPrime as true
        boolean isPrime = true;

        // Check for numbers greater than 1
        if (num <= 1) {
			// Numbers less than or equal to 1 are not prime
            isPrime = false;  
        } else {
            // Loop through all numbers from 2 to num-1 to check for divisibility
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    // If num is divisible by i, it is not a prime number
                    isPrime = false;
                    break; // Exit the loop
                }
            }
        }

        // Output result based on isPrime value
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        
    }
}
