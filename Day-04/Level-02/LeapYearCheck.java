import java.util.Scanner;

public class LeapYearCheck {

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            throw new IllegalArgumentException("Year must be 1582 or later for the Gregorian calendar.");
        }
        // Leap year conditions
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the year
        System.out.print("Enter a year (1582 or later): ");
        int year = scanner.nextInt();

        // Validate input
        if (year < 1582) {
            System.out.println("The year must be 1582 or later, as it follows the Gregorian calendar.");
        } else {
            // Check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }

        
    }
}
