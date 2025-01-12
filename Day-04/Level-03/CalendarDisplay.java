import java.util.Scanner;

public class CalendarDisplay {

    // Array to store month names
    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month (for non-leap years)
    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get month and year from user input
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year (e.g., 2005): ");
        int year = scanner.nextInt();

        // Call method to display the calendar
        displayCalendar(month, year);
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get the month name
        String monthName = getMonthName(month);

        // Get the number of days in the month
        int days = getDaysInMonth(month, year);

        // Get the first day of the month (using Gregorian calendar algorithm)
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= days; day++) {
            // Print the day with proper formatting
            System.out.printf("%3d", day);

            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Move to the next line if the calendar doesn't end on Saturday
        if ((firstDay + days) % 7 != 0) {
            System.out.println();
        }
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return monthNames[month - 1];
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        // Check for leap year for February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year condition: divisible by 4, not divisible by 100, unless divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month (using Gregorian calendar algorithm)
    public static int getFirstDayOfMonth(int month, int year) {
        // Gregorian calendar algorithm to find the first day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        return d0; // The day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }
}
