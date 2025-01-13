import java.util.Scanner;

public class NumberFormatExceptionExample {

    // Method to generate the exception
    public static void generateException(String input) {
        System.out.println("Generating NumberFormatException...");
        System.out.println("Input string: " + input);

        // Attempt to parse the input as an integer
        int number = Integer.parseInt(input); // This will throw NumberFormatException if input is not a valid integer

        System.out.println("Parsed number: " + number);
    }

    // Method to handle the exception
    public static void handleException(String input) {
        System.out.println("Handling NumberFormatException...");
        System.out.println("Input string: " + input);

        try {
            // Attempt to parse the input as an integer
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
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
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }

        // Call method to handle exception
        handleException(userInput);

        scanner.close();
    }
}
