import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker5 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number
    public static int findGreatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; // Second last element (ignoring the number itself)
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static long productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += factorial(digit);
        }
        return sum == number;
    }

    // Helper method to calculate factorial
    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Helper method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Factors
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        // Greatest factor
        System.out.println("Greatest factor: " + findGreatestFactor(number));

        // Sum of factors
        System.out.println("Sum of factors: " + sumOfFactors(number));

        // Product of factors
        System.out.println("Product of factors: " + productOfFactors(number));

        // Product of cube of factors
        System.out.println("Product of cube of factors: " + productOfCubeOfFactors(number));

        // Perfect number
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));

        // Abundant number
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));

        // Deficient number
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));

        // Strong number
        System.out.println("Is Strong Number: " + isStrongNumber(number));

    }
}
