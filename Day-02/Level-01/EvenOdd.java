import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
	// to take the input from the user 
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number ");
		// created the variable to Number
		int  Number = input.nextInt();
		// checking if the Number is natural Number or not
		if(Number>0)
		{  
		   
		   while( Number >0 )
		   {
				//checking if the number is odd or even 
				if(Number%2==0)
				{
					System.out.println(" The Number " + Number + " is Even");
				}
				else
				{
					System.out.println(" The Number " + Number + " is Odd ");
				}
				Number = Number -1;
		   }
		}
		else
		{
		  System.out.println(" The Number " + Number + " is Not Natural Number Pls Enter the Natural Number");
		}
	
        
    }
}