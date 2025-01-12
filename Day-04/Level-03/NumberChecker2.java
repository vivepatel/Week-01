import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker2 {

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

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 rows for digits 0-9

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Store digit
        }

        for (int digit : digits) {
            frequency[digit][1]++; // Increment frequency
        }

        return frequency;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get digits array
        int[] digits = getDigitsArray(number);

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));

        // Digits array
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        // Check if number is a Harshad number
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        // Frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies: ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
            }
        }

       
    }
}
