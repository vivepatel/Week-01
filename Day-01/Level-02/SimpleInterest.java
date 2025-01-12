import java.util.Scanner;

public class SimpleInterest{
	public static void main(String [] args) {
		// Scanner is used to take input from user
        Scanner input= new Scanner(System.in);
		System.out.println(" Enter the Principal Rate and Time  ");
		// created 3 variables Principal Rate and Time
		double Principal = input.nextDouble();
		double Rate      = input.nextDouble();
		double Time    	 = input.nextDouble();
		// Created the variable simpleInterest and calculated 
		double simpleInterest = Principal * Rate * Time / (double)(100);
		// display the output
		System.out.println(" The simple Interest is " + simpleInterest+ "for Principal"+ Principal + " Rate of Interest " + Rate + " and Time " + Time );
		
		
	}
} 

