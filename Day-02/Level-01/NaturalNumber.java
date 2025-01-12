import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        // Scanner for Taking Input
        Scanner input = new Scanner(System.in);
        //	User the read and input
        System.out.println(" Enter the number");
        // created 1 vairables for number
        double number = input.nextInt();
        // checking the number is positive or not
        if(number>0)
        {
            // calculating the sum of natural numbers;
            double calcualteNutuaralnumbers = number * (number+1)/2 ;
            // display output
            System.out.println("The sum  of "+ number + " Nutural numbers is "+ calcualteNutuaralnumbers);
        }
        else
        {
            // display output
            System.out.println(" The number is "+ number+" Is not a natural number");
        }

    }
}