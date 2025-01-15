import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of characters (ASCII range)

        // Loop to calculate the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Count distinct characters
        int distinctCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                distinctCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[distinctCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Store the character
                result[index][1] = Integer.toString(charFrequency[i]); // Store its frequency
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

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequencies(text);

        // Display the results
        System.out.println("Character Frequency:");
        System.out.println("--------------------");
        for (String[] row : frequencies) {
            System.out.println(row[0] + " -> " + row[1]);
        }

        
    }
}
