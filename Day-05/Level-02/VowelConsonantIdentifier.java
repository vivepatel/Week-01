import java.util.Scanner;

public class VowelConsonantIdentifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();
        
        // Find vowels and consonants in the string
        String[][] characterTypes = findVowelsAndConsonants(inputText);
        
        // Display the results in a tabular format
        displayCharacterTypes(characterTypes);
        
        scanner.close();
    }

    // Method to check if a character is a vowel or consonant
    public static String checkCharacter(char ch) {
        // Convert to lowercase if it's an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase using ASCII
        }
        
        // Check if the character is a vowel or consonant
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String text) {
        int length = text.length();
        String[][] result = new String[length][2]; // 2D array to hold character and its type
        
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            String type = checkCharacter(ch);
            result[i][0] = String.valueOf(ch); // Character
            result[i][1] = type; // Vowel, Consonant, or Not a Letter
        }
        
        return result;
    }

    // Method to display the 2D array of character types in a tabular format
    public static void displayCharacterTypes(String[][] characterTypes) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("---------------------------");
        for (String[] characterInfo : characterTypes) {
            System.out.printf("%-10s %-15s%n", characterInfo[0], characterInfo[1]);
        }
    }
}