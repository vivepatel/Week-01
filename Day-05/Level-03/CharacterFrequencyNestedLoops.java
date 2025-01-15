import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequencies(String text) {
        char[] characters = text.toCharArray(); // Convert string to char array
        int[] frequencies = new int[characters.length]; // Array to store frequencies

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip already processed characters
                frequencies[i] = 1; // Initialize frequency for current character

                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++;
                        characters[j] = '0'; // Mark duplicate character as processed
                    }
                }
            }
        }

        // Count non-zero frequencies to determine the size of the result array
        int uniqueCount = 0;
        for (int freq : frequencies) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Create a result array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;

        // Populate the result array
        for (int i = 0; i < characters.length; i++) {
            if (frequencies[i] > 0) {
                result[index] = characters[i] + " -> " + frequencies[i];
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find character frequencies
        String[] frequencies = findCharacterFrequencies(text);

        // Display the results
        System.out.println("Character Frequency:");
        System.out.println("--------------------");
        for (String row : frequencies) {
            System.out.println(row);
        }

       
    }
}
