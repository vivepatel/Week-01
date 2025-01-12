import java.util.Scanner;

public class Total2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // created the variables Total
        double total = 0.0;
		// create the Number
		double  Number;
		// created while loop for the total amount
		while(true)
		{
		  //	User the read and input
        System.out.println(" Enter the Number ");
         Number = input.nextDouble();
		 // if user Input 0 we will break the Loop and print the Total
          if( Number <= 0){
		     break;
		  }	
          total = total+ Number;		  
		}
		// Display outPut
        System.out.println( total);
	
        
    }
}