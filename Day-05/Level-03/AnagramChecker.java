import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays for both texts
        int[] frequency1 = new int[256]; // ASCII character set size
        int[] frequency2 = new int[256];

        // Find frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        // Find frequency of characters in the second text
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        // Compare frequencies of characters
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true; // Texts are anagrams
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Sanitize input
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Sanitize input

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display result
        System.out.println("\nAnagram Check Result:");
        System.out.println("----------------------");
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        
    }
}
