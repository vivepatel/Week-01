import java.util.Scanner;

public class CompleteIncome{

public static void main(String [] args){
	    // Scanner is used to take input from user
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Salary and Bonus");
		// created two variables salary and bonus
		double salary = input.nextDouble();
		double bonus  = input.nextDouble();
	    // just add salary and bonus to print the complete income
		System.out.println(" The salary is INR " + salary + " and bonus is INR " + bonus + ".Hence Total Income is INR " + (salary + bonus) );
		
		

}
}

