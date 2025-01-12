public class Volumeofearth {
    public static void main(String[] args) {

        double Radius = 6378;
		// Here we have used the Math Predefined functions for power and Pi 
        double  volumeofEarthKilometers = (4 / 3) * Math.PI * Math.pow(Radius, 3);
		// Here we are Calculating for the miles
		double volumeofEarthMiles = volumeofEarthKilometers * 0.6 ;           
        System.out.println(" The Volume of earth  in Cubic kilometers is  " + volumeofEarthKilometers+ " and cubic Miles is " + volumeofEarthMiles);  
        
    }
}

