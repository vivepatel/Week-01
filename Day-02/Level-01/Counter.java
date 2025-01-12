import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //	User the read and input
        System.out.println(" Enter the Number ");
        // created the variables COunter
        int counter = input.nextInt();
        // checking if the number are there
		// created a while  loop to print the  counter
		while(counter-- >1)
		{
		  System.out.println(counter);
		}
	
        
    }
}