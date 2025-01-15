import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string without using the length() method
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text); // Calculate length of the string
        char[] tempArray = new char[length]; // Temporary array to store unique characters
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

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the unique characters
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

       
    }
}
