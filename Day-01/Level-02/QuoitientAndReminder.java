import java.util.Scanner;

public class QuoitientAndReminder{
	public static void main( String[] args){
	 // created Scanner for taking input form user
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the Number 1 and Number 2");
	 // created the variables number1 and number2
	 double number1 = input.nextDouble();
	 double number2 = input.nextDouble();
	 // created the variables quotient and reminder
	 // calculated the quotient
	 double quotient = number1 / number2;
	 // calculated the reminder
	 double reminder = number1%number2;
	 // Display the output
	 System.out.println("The Quoitient is "+ quotient +" and Reminder is "+reminder+" of two numbers"+ number1 +" and "+number2);
	 
	 
	}
}