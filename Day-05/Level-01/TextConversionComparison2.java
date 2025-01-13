import java.util.Scanner;

public class TextConversionComparison2 {

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

    // Method to convert each character to lowercase using charAt()
    public static String toLowerCaseCustom(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32)); // Convert to lowercase
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

    // Method to split text into words and return a 2D array with word lengths
    public static String[][] splitTextIntoWords(String input) {
        String[] words = input.split(" ");
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        return result;
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
        boolean areUpperEqual = compareStrings(upperCaseBuiltIn, upperCaseCustom);

        // Convert to lowercase using built-in method
        String lowerCaseBuiltIn = userInput.toLowerCase();

        // Convert to lowercase using custom method
        String lowerCaseCustom = toLowerCaseCustom(userInput);

        // Compare the results
        boolean areLowerEqual = compareStrings(lowerCaseBuiltIn, lowerCaseCustom);

        // Split text into words and their lengths
        String[][] wordsAndLengths = splitTextIntoWords(userInput);

        // Display results
        System.out.println("\nOriginal Text: " + userInput);
        System.out.println("Uppercase (Built-in): " + upperCaseBuiltIn);
        System.out.println("Uppercase (Custom): " + upperCaseCustom);
        System.out.println("Are both uppercase methods producing the same result? " + areUpperEqual);

        System.out.println("\nLowercase (Built-in): " + lowerCaseBuiltIn);
        System.out.println("Lowercase (Custom): " + lowerCaseCustom);
        System.out.println("Are both lowercase methods producing the same result? " + areLowerEqual);

        System.out.println("\nWords and their lengths:");
        for (String[] wordInfo : wordsAndLengths) {
            System.out.println("Word: " + wordInfo[0] + ", Length: " + wordInfo[1]);
        }

        scanner.close();
    }
}
