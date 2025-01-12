import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get the number for which the multiplication table is to be generated
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication table results
        int[] table = new int[10];

        // Populate the array with the multiplication results
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

    }
}