import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		// Take input for a number
        System.out.print("Enter a number: ");
        String inputNumber = scanner.nextLine();
		// Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];
		// Loop through each character in the input number
        for (int i = 0; i < inputNumber.length(); i++) {
            char digitChar = inputNumber.charAt(i);
            // Check if the character is a digit
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                frequency[digit]++;
            }
        }
		// Display the frequency of each digit
        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
	}
}