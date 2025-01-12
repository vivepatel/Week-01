import java.util.Scanner;

public class VoteorNot {
    public static void main(String[] args) {
        // Scanner for Taking Input
        Scanner input = new Scanner(System.in);
        //	User the read and input
        System.out.println(" Enter the age");
        // created variable Age
        int Age= input.nextInt();
        // checking the person has a valid age or not of 18 or above
        if(Age >= 18)
        {
            System.out.println("The Person's age is greater or equal to 18 then the output is"+ Age);
        }
        else
        {
            System.out.println(" The Person's age is "+ Age+ " cannot vote");
        }
    }
}
