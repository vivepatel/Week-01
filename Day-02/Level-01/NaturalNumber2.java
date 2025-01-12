import java.util.Scanner;

public class NaturalNumber2 {
    public static void main(String[] args) {
	// to take the input from the user 
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number ");
		// created the variable to Number
		int  Number = input.nextInt();
		// Calculating the naturalNumber by using formula n*(n+1)/2
		int  naturalNumber =  Number*(Number+1)/2;
		int  naturalNumber2 =  0;
		for( int i=Number ; i>0 ;i--)
		{
			// here we are calculating the Natural Numbver by Just adding them
		    naturalNumber2 = naturalNumber2 + i;
			
		}
		if(naturalNumber == naturalNumber2)
		{
		System.out.println(" Natural Number sum is Equal by both the Logic");
		
		}
		else
		{
		System.out.println("Natural Number sum is Not Equal");
		}
        
       
	
        
    }
}