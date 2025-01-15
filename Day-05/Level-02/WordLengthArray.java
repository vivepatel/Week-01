import java.util.Scanner;

public class WordLengthArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        
        // Split the text into words using custom method
        String[] words = customSplit(inputText);
        
        // Create a 2D array of words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);
        
        // Display the results in a tabular format
        System.out.printf("%-20s %s%n", "Word", "Length");
        System.out.println("-------------------- ------");
        for (String[] wordInfo : wordLengthArray) {
            System.out.printf("%-20s %d%n", wordInfo[0], Integer.parseInt(wordInfo[1]));
        }
        
        scanner.close();
    }

    // Method to split the text into words without using the built-in split() method
    public static String[] customSplit(String text) {
        int length = customLength(text);
        int spaceCount = 0;

        // Count spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Create an array to store the words
        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        int startIndex = 0;

        // Extract words using the indexes of spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(startIndex, i);
                startIndex = i + 1;
            }
        }
        // Add the last word
        words[wordIndex] = text.substring(startIndex, length);

        return words;
    }

    // Method to find the length of the String without using built-in length() method
    public static int customLength(String str) {
        int length = 0;
        while (true) {
            try {
                char c = str.charAt(length);
                length++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Word
            wordLengthArray[i][1] = String.valueOf(customLength(words[i])); // Length as String
        }
        
        return wordLengthArray;
    }
}