
import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Define an integer array of size 5
        int[] numbers = new int[5];

        // Get user input for the array
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // Check if the number is even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative.");
            } else {
                System.out.println(numbers[i] + " is Zero.");
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.print("Comparison of first and last elements: ");
        if (first > last) {
            System.out.println("First element is greater than the last element.");
        } else if (first < last) {
            System.out.println("First element is less than the last element.");
        } else {
            System.out.println("First element is equal to the last element.");
        }

    }
}

