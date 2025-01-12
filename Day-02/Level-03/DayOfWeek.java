public class DayOfWeek {
    public static void main(String[] args) {
        // Check if the user provided the correct number of arguments
        if (args.length != 3) {
            System.out.println("Please provide exactly 3 arguments: month, day, and year.");
            return;
        }

        // Parse the command-line arguments into integers
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Apply the Zeller's Congruence formula for the Gregorian calendar
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result: 0 for Sunday, 1 for Monday, ..., 6 for Saturday
        System.out.println(d0);
    }
}
