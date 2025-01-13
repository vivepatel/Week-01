import java.util.Scanner;

public class TextToUpperCaseComparison {

    // Method to convert each character to uppercase using charAt()
    public static String toUpperCaseCustom(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32)); // Convert to uppercase
            } else {
                result.append(ch); // Keep the character as is
            }
        }

        return result.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Convert to uppercase using built-in method
        String upperCaseBuiltIn = userInput.toUpperCase();

        // Convert to uppercase using custom method
        String upperCaseCustom = toUpperCaseCustom(userInput);

        // Compare the results
        boolean areEqual = compareStrings(upperCaseBuiltIn, upperCaseCustom);

        // Display results
        System.out.println("Original Text: " + userInput);
        System.out.println("Uppercase (Built-in): " + upperCaseBuiltIn);
        System.out.println("Uppercase (Custom): " + upperCaseCustom);
        System.out.println("Are both methods producing the same result? " + areEqual);

        scanner.close();
    }
}
