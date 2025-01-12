import java.util.Scanner;

public class integerCheck {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 < number2) {
            return -1; // number2 is greater
        } else {
            return 0; // numbers are equal
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Process each number in the array
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (isPositive(number)) {
                System.out.print("Number " + number + " is positive");
                if (isEven(number)) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else {
                System.out.println("Number " + number + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult > 0) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult < 0) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first and last numbers are equal.");
        }

        
    }
}
