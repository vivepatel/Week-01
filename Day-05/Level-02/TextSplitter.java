import java.util.Scanner;
public class TextSplitter {
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

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        
        // Split using custom method
        String[] customSplitWords = customSplit(inputText);
        
        // Split using built-in method
        String[] builtInSplitWords = inputText.split(" ");
        
        // Compare the two arrays
        boolean areEqual = compareArrays(customSplitWords, builtInSplitWords);
        
        // Display results
        System.out.println("Custom Split Words:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }
        
        System.out.println("\nBuilt-in Split Words:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }
        
        System.out.println("\nAre the two methods' results equal? " + areEqual);
    }
}