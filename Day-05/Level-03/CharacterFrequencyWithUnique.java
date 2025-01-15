import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] tempArray = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the tempArray
            for (int j = 0; j < uniqueCount; j++) {
                if (tempArray[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to tempArray
            if (isUnique) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array with the exact size of unique characters
        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(tempArray, 0, uniqueChars, 0, uniqueCount);

        return uniqueChars;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        char[] uniqueChars = findUniqueCharacters(text); // Get unique characters
        String[][] result = new String[uniqueChars.length][2];

        // Calculate frequency for each unique character
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            // Count occurrences of currentChar in the text
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            result[i][0] = Character.toString(currentChar); // Store character
            result[i][1] = Integer.toString(frequency); // Store frequency
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
        String[][] frequencies = findCharacterFrequencies(text);

        // Display the results
        System.out.println("Character Frequency:");
        System.out.println("--------------------");
        for (String[] row : frequencies) {
            System.out.println(row[0] + " -> " + row[1]);
        }

        
    }
}
