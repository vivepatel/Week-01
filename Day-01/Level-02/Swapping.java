import java.util.Scanner;

public class Swapping{

public static void main(String [] args){
	    // Scanner is used to take input from user
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Two Numbers for  Swaping");
		// created two variables number1 and number2
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		// created the variables temp for swaping
		double temp = 0;
		// here we have done  the swaping usinng the third variable
		temp = number1;
		number1 = number2;
		number2 = temp;
		// display the output
		System.out.println("The Swapped Numbers are " + number1 + " and " + number2 );
}
}