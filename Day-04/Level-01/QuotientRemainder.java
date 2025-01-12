import java.util.Scanner;

public class QuotientRemainder {
    // Method to find the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;

        // Return the results as an array
        return new int[] { remainder, quotient };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take user input for the number and divisor
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = sc.nextInt();

        // check divisor input
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
            return;
        }

        // Find quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Output the results
        System.out.println("The quotient is: " + result[1]);
        System.out.println("The remainder is: " + result[0]);
    }

   
}
