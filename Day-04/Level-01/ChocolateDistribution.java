import java.util.Scanner;

public class ChocolateDistribution {
    // Method to find the number of chocolates each child gets and remaining chocolates
    public static int[] divideChocolates(int Chocolates, int Children) {
        int remainder = Chocolates % Children;  
        int chocoPerChild = Chocolates / Children;  

        return new int[] { remainder, chocoPerChild };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user for number of chocolates and children
        System.out.println("Enter the number of chocolates:");
        int Chocolates = sc.nextInt();

        System.out.println("Enter the number of children:");
        int Children = sc.nextInt();

        // check input
        if (Children == 0) {
            System.out.println("Number of children cannot be zero.");
            return;
        }

        // Calculate the number of chocolates each child gets and remaining chocolates
        int[] result = divideChocolates(Chocolates, Children);

        // Output the results
        System.out.println("Each child will get " + result[1] + " chocolates.");
        System.out.println("The remaining chocolates are " + result[0] + ".");
    }

    
}
