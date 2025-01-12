import java.util.Scanner;

public class TypeofNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //	User the read and input
        System.out.println(" Enter the Number ");
        // created the variables Number
        int Number = input.nextInt();
        // checking if the number is Positive negtive and Zero
        if(Number >0)
        {
            System.out.println("Positive");
        }
        else if (Number == 0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}