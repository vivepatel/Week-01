import java.util.Scanner;

public class NaturalNumbersSum {
    // Method to calculate the sum of the first n natural numbers
    public static int Sum(int n) {
        int sum = 0; 
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();

        // check input
        if (n <= 0) {
            System.out.println("enter a positive integer greater than zero.");
            return;
        }

        // Calculate the sum using the method
        int sum = Sum(n);

        // Output the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }

    
}
