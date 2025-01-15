import java.util.Scanner;
  public class StringTrimmer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = input.nextLine();

        // Trim spaces using charAt() method
        int[] trimmedIndex = trimSpaces(text);
        String trimmedUsingCharAt = createSubstring(text, trimmedIndex[0], trimmedIndex[1]);

        // Trim spaces using built-in method
        String trimmedUsingBuiltIn = text.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedUsingCharAt, trimmedUsingBuiltIn);

        System.out.println("Trimmed String using charAt(): '" + trimmedUsingCharAt + "'");
        System.out.println("Trimmed String using built-in method: '" + trimmedUsingBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);
    }
	
	// Method to trim leading and trailing spaces using charAt()
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character from the start
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the first non-space character from the end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
	
	// Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }
	
	// Method to compare two strings using charAt()
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
}