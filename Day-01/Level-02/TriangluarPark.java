import java.util.Scanner;

public class TriangluarPark{
	public static void main(String [] args) {
		// Scanner is used to take input from user
        Scanner input= new Scanner(System.in);
		System.out.println(" Enter the 3 Sides of the TriangluarPark ");
		// created all three variables side1 , side2 and side3
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		// km converted to meter due to perimeter  is in meter
		double distance = 5*1000;
		// we have calculated the perimeter of TriangluarPark
		double perimeter = side1 + side2 + side3 ;
		// we have to calculated the rounds taken by the  athlete
		double rounds = distance/perimeter;
		// display the output
		System.out.println("The total number of rounds the  athlete will run is " + rounds + " to complete 5km");
		
	}
}