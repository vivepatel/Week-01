import java.util.Scanner;

public class StringIndexOutOfBoundsExample {

    // Method to generate the exception
    public static void generateException(String input) {
        System.out.println("Generating StringIndexOutOfBoundsException...");
        System.out.println("Input string: " + input);
        
        // Attempt to access an index beyond the string's length
        char ch = input.charAt(input.length()); // This will throw StringIndexOutOfBoundsException
        
        System.out.println("Character at invalid index: " + ch);
    }

    // Method to handle the exception
    public static void handleException(String input) {
        System.out.println("Handling StringIndexOutOfBoundsException...");
        System.out.println("Input string: " + input);

        try {
            // Attempt to access an index beyond the string's length
            char ch = input.charAt(input.length());
            System.out.println("Character at invalid index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }

        // Call method to handle exception
        handleException(userInput);

        
    }
}
