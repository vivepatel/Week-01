import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
	// to take the input from the user 
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number ");
		// created the variable to Number
		int  Number = input.nextInt();
		int factorial = 1;
		while( Number >0 )
		{   
		    // calculating the Factorial
		     factorial= factorial*Number;
			 Number = Number - 1 ;
		}
       System.out.println(" The Factorial of Number  is " + factorial);
	   
	
        
    }
}