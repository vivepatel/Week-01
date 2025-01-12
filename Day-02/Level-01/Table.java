import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
	// to take the input from the user 
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number ");
		// created the Number variable
		int Number= input.nextInt();
		for ( int i=6 ; i <=9 ; i++)
         {  // creating a multiplication table for Number From 6 to 9
		     System.out.println( Number + " * " + i + " = " +Number*i);
			 
		 }		
		
        
    }
}