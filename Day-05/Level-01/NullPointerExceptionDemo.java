public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initializing the variable to null

        // This will throw NullPointerException
        System.out.println("Length of the text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // Initializing the variable to null

        try {
            // Attempt to access the length method of the null variable
            System.out.println("Length of the text: " + text.length());
        } catch (NullPointerException e) {
            // Catch and handle the exception
            System.out.println("Caught a NullPointerException: The variable 'text' is null.");
        }
    }

    public static void main(String[] args) {
        // Call the method that generates the exception
        System.out.println("Calling generateException() method...");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Refactor to handle the exception using the handleException method
        System.out.println("\nCalling handleException() method...");
        handleException();
    }
}
