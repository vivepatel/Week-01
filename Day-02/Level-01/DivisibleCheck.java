import java.util.Scanner;

public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Number ");
        // created the variable number
        int number = input.nextInt();
        // check the number is divisible by 5 or not
        if( number%5==0)
        {
            System.out.println(" the number "+ number+" divsible by 5 ? Yes");
        }
        else
        {
            System.out.println(" the number "+ number+" divsible by 5 ? No");
        }
    }
}
