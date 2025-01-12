import java.util.Scanner;

public class LeapYearProgram1 {
    public static void main(String[] args) {
	// for taking input from user 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
		// created variables year 
        int year = input.nextInt();

        // Check if the year is within the Gregorian calendar
        if (year < 1582) {
            System.out.println("The year must be 1582 or later.");
        } else {
            
            if (year % 4 != 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 100 != 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
		}

            
    }
}
