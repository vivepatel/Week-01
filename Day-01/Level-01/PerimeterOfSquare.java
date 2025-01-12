import java.util.Scanner;

public class PerimeterOfSquare{
    public static void main(String[] args) {
        // we have created the Scanner object for taking inputs
        Scanner input= new Scanner(System.in);
		System.out.println(" Enter the Side of the Square ");
		// created a variable Side
		double Side = input.nextDouble();
		//  created a variable perimeterOfSquare and Calculated It.
		double perimeterOfSquare = 4* Side;
		System.out.println("The Length of the side is " + Side + " whose perimeter is " + perimeterOfSquare );
		
    }
}

