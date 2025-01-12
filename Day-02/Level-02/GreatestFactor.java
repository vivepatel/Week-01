import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store the greatest factor, initially set to 1
        int greatestFactor = 1;

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {  // Check if i is a factor of the number
                greatestFactor = i;
                break;  // Exit the loop once the greatest factor is found
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        
    }
}
