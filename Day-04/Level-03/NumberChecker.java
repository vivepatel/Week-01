import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));

        // Get digits array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Check if number is a duck number
        System.out.println("Is Duck Number: " + isDuckNumber(number));

        // Check if number is an Armstrong number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        // Find largest and second largest digits
        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest and Second Largest: " + Arrays.toString(largestTwo));

        // Find smallest and second smallest digits
        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest and Second Smallest: " + Arrays.toString(smallestTwo));

    }
}
