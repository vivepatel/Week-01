import java.util.Scanner;

public class SumOfNaturalNumber {

    //  find the sum of n natural numbers by recursion method
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + findSumRecursive(n - 1); 
    }

    // Method to find the sum of n natural numbers using the formula
    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number is not a natural number.");
            return;
        }

        // Calculate sum using recursion and formula
        int sumRecursive = findSumRecursive(n);
        int sumFormula = findSumFormula(n);

        System.out.println("Sum of the first " + n + " natural numbers using recursion: " + sumRecursive);
        System.out.println("Sum of the first " + n + " natural numbers using formula: " + sumFormula);

        // Compare 
        if (sumRecursive == sumFormula) {
            System.out.println("The results from recursion and formula match. The calculation is correct.");
        } else {
            System.out.println("The results do not match. Check for errors.");
        }

        
    }
}
