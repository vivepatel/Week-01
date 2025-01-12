import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args) {
	// to take the input from the user 
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number ");
		// created the variable to Number
		int  Number = input.nextInt();
		int factorial = 1;
		for( int i=1 ;i<=Number; i++)
		{   
		    // calculating the Factorial
		     factorial= factorial*i;
			 
		}
       System.out.println(" The Factorial of Number  is " + factorial);
	   
	
        
    }
}