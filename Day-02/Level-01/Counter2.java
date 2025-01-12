import java.util.Scanner;

public class Counter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //	User the read and input
        System.out.println(" Enter the Number ");
        // created the variables COunter
        int counter = input.nextInt();
        // checking if the number are there
		// created a for  loop to print the  counter
		for( int i=counter ; i>0 ; i--)
		{
		   System.out.println(counter);
		   counter -= 1;
		}
	
        
    }
}