import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Check palindrome by comparing characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Check palindrome using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseString(text);

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper Method: Reverse a string using charAt()
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);
        }
        return reversed;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Convert to lower case for case-insensitive comparison
        text = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Check palindrome using three logics
        boolean resultIterative = isPalindromeIterative(text);
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean resultUsingArrays = isPalindromeUsingArrays(text);

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("--------------------------");
        System.out.println("Using Iterative Logic: " + (resultIterative ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursive Logic: " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Arrays Logic: " + (resultUsingArrays ? "Palindrome" : "Not a Palindrome"));

        
    }
}
