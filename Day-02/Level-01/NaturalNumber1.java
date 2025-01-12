import java.util.Scanner;

public class NaturalNumber1 {
    public static void main(String[] args) {
	// to take the input from the user 
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int  Number = input.nextInt();
		int  naturalNumber =  Number*(Number+1)/2;
		int  naturalNumber2 =  0;
		while(Number > 0)
		{
		    naturalNumber2 = naturalNumber2 + Number;
			Number = Number-1;
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