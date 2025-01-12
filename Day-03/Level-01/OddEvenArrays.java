
import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a natural number
        if (number < 1) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return; // Exit the program
        }
        
        // Create arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1]; // Size for even numbers
        int[] oddNumbers = new int[number / 2 + 1];  // Size for odd numbers
        
        // Index variables for odd and even numbers
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Iterate from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i; // Save even number
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i; // Save odd number
                oddIndex++;
            }
        }
        
        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println(); // New line
        
        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println(); // New line
  
    }
}

