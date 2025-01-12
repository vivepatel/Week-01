import java.util.Scanner;

public class WeightToPound{
	public static void main(String [] args) {
		// Scanner is used to take input from user
        Scanner input= new Scanner(System.in);
		System.out.println(" Enter the Weight  ");
		// created the Weight variable
		double Weight = input.nextDouble();
		// created a variable Pound  and converted Wieght to Pound
		double Pound = Weight * 2.2;
		System.out.println(" The Weight of the  Person  in Pound is  " + Pound + " and in kg is " + Weight );
		
		
		
	}
} 

