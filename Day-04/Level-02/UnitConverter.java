import java.util.Scanner;

public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmTomiles = 0.621371;
        return km * kmTomiles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Example
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the Kilometers ,  Miles , Meters and Feet");
        double kilometers = input.nextDouble();
        double miles = input.nextDouble();
        double meters = input.nextDouble();
        double feet = input.nextDouble();

        //  conversions
        System.out.println(kilometers + " km = " + convertKmToMiles(kilometers) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}
