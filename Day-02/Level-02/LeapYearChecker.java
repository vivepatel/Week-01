import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
		// taking input as Scanner object to take the input 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
		// created the variable year 
        int year = input.nextInt();
       // calculating the  year is leap or not 
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        
    }
}
