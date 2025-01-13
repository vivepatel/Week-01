import java.util.Scanner;

class StringToCharArray {
    // Method to return characters of a string as a char array without using toCharArray()
    public static char[] stringToCharArray(String string1) {
        char[] charArray = new char[string1.length()];
        for (int i = 0; i < string1.length(); i++) {
            charArray[i] = string1.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean isEqual(char[] charArray1, char[] charArray2) {
        if (charArray1.length != charArray2.length) {
            return false;
        }
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the String:");
        String string1 = input.nextLine();

        // Using built-in toCharArray() method
        char[] charArray1 = string1.toCharArray();

        // Using user-defined method
        char[] charArray2 = stringToCharArray(string1);

        // Comparing the arrays
        boolean isEqual = isEqual(charArray1, charArray2);

        // Displaying the result
        if (isEqual) {
            System.out.println("The character arrays are equal.");
        } else {
            System.out.println("The character arrays are not equal.");
        }

      
    }
}
