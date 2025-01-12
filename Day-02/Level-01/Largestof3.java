import java.util.Scanner;

public class Largestof3 {
    public static void main(String[] args) {
        // Scanner for Taking Input
        Scanner input = new Scanner(System.in);
        //	User the read and input
        System.out.println(" Enter the number1, number2 and number3");
        // created 3 vairables for numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        // Checking which   numbers is Largest among the 3
        if(number1>number2)
        {
            if(number1>number3)
            {
                System.out.println(" Is the first number  the Largest ? Yes \n Is the Second number  the Largest ? No \n Is the Third  number  the Largest ? No");
            }
            else
            {
                System.out.println(" Is the first number  the Largest ? No \n Is the Second number  the Largest ? No \n Is the Third  number  the Largest ? Yes");
            }
        }
        else {
            if (number2 > number3) {
                System.out.println(" Is the first number  the Largest ? No \n Is the Second number  the Largest ? Yes \n Is the Third  number  the Largest ? No");
            } else {
                System.out.println(" Is the first number  the Largest ? No \n Is the Second number  the Largest ? No \n Is the Third  number  the Largest ? Yes");
            }
        }
    }
}