import java.util.Scanner;

public class FactorOfNumber {

        // Method to find the factors of a number
    public static int[] findFactors(int number) {
        
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; 
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;  
            }
        }

        return factors;
    }

    // Method to calculate the sum of factors
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];  
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static int calculateProduct(int[] factors) {
        int product = 1;  
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];  
        }
        return product;
    }

    // Method to calculate the sum of the squares of factors
    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += factors[i] * factors[i];  // Square the factor and add to sum
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the factors of the number and store them in an array
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Find the sum of the factors
        int sum = calculateSum(factors);
        System.out.println("Sum of factors: " + sum);

        // Find the sum of squares of the factors
        int sumOfSquares = calculateSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        // Find the product of the factors
        int product = calculateProduct(factors);
        System.out.println("Product of factors: " + product);

        
    }

    
}
