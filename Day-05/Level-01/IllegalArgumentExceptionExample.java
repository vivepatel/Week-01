import java.util.Scanner;

public class IllegalArgumentExceptionExample {

    // Method to generate the exception
    public static void generateException(String input) {
        System.out.println("Generating IllegalArgumentException...");
        System.out.println("Input string: " + input);

        // Attempt to use substring with start index greater than end index
        String result = input.substring(5, 3); // This will throw IllegalArgumentException

        System.out.println("Substring result: " + result);
    }

    // Method to handle the exception
    public static void handleException(String input) {
        System.out.println("Handling IllegalArgumentException...");
        System.out.println("Input string: " + input);

        try {
            // Attempt to use substring with start index greater than end index
            String result = input.substring(5, 3);
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call method to generate exception
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }

        // Call method to handle exception
        handleException(userInput);

        scanner.close();
    }
}
