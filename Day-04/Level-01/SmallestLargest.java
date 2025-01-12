import java.util.Scanner;

public class SmallestLargest {
    // Method to find the smallest and largest of three numbers
    public static int[] SearchSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = num1;
        int largest = num1;

        // Check for the smallest number
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Check for the largest number
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Return the results
        return new int[] { smallest, largest };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input for three numbers
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();

        // Find the smallest and largest numbers
        int[] result = SearchSmallestAndLargest(num1, num2, num3);

        // Output the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
    }

    
}
