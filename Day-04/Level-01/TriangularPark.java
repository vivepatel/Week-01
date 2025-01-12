import java.util.Scanner;

public class TriangularPark {

    // Method to calculate the perimeter
    public static int calculatePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds
    public static int calculateRounds(int perimeter, int Distance) {
       return  (Distance / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sides of the triangular park
        System.out.println("Enter the length of the first side of the triangular park (in meters):");
        int side1 = sc.nextInt();
        
        System.out.println("Enter the length of the second side:");
        int side2 = sc.nextInt();
        
        System.out.println("Enter the length of the third side :");
        int side3 = sc.nextInt();

        // Calculate the perimeter
        int perimeter = calculatePerimeter(side1, side2, side3);

        // number of rounds needed
        int Distance = 5000; 
        int rounds = calculateRounds(perimeter, Distance);

        // Output the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
       
       
    }
    
    
}
