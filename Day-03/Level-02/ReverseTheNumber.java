import java.util.Scanner;
  public class ReverseTheNumber{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Calculate the digits in the number and count it
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        // Creating an array to store the digits
        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10; 
            number /= 10; 
            index++;
        }

        // Display the reversed number directly from the array
        System.out.print("The reversed number is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
 }