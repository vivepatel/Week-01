import java.util.Scanner;

public class SmallestofThe3 {
    public static void main(String[] args) {
		// Scanner for Taking Input 
        Scanner input = new Scanner(System.in);
	    //	User the read and input
        System.out.println(" Enter the number1, number2 and number3");
		// created 3 vairables for numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
		// Checking if the number1 is smallest among the 3
        if(number1<number2)
        {
            if(number1<number3)
            {
                System.out.println(" Is the first number  the smalles ? Yes");    
            }
            else
            {
                System.out.println(" Is the first number  the smalles ? No");
            }
        }
        else
        {
            System.out.println(" Is the first number  the smalles ? No");
        }
    }
}
