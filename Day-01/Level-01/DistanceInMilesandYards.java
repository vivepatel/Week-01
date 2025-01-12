import java.util.Scanner;

public class DistanceInMilesandYards{
    public static void main(String[] args) {
        // we have created the Scanner object for taking inputs
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter the Distance In Feet ");
		// created the varible distanceInFeet
		double distanceInFeet = input.nextDouble();
		// created the varibles distanceInYard and distanceInMiles and calculated
		double  distanceInYard= distanceInFeet * 3;
		double   distanceInMiles = distanceInYard * 1760;
		System.out.println(" The Distance in Yard and Miles is "+ distanceInYard+" , "+ distanceInMiles );
		
    }
}

