import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {

    // Method to generate the exception
    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        System.out.println("Names array: ");
        for (String name : names) {
            System.out.println(name);
        }

        // Attempt to access an index larger than the length of the array
        String name = names[names.length]; // This will throw ArrayIndexOutOfBoundsException

        System.out.println("Accessed name: " + name);
    }

    // Method to handle the exception
    public static void handleException(String[] names) {
        System.out.println("Handling ArrayIndexOutOfBoundsException...");
        System.out.println("Names array: ");
        for (String name : names) {
            System.out.println(name);
        }

        try {
            // Attempt to access an index larger than the length of the array
            String name = names[names.length];
            System.out.println("Accessed name: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for array size and elements
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Call method to generate exception
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException: " + e.getMessage());
        }

        // Call method to handle exception
        handleException(names);

        scanner.close();
    }
}
