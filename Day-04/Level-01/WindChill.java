import java.util.Scanner;

public class WindChill {
    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter the temperature in Fahrenheit:");
        double temperature = sc.nextDouble();

        System.out.println("Enter the wind speed in miles per hour:");
        double windSpeed = sc.nextDouble();

        // Create an instance of WindChill to call the method
        WindChill calculator = new WindChill();

        // Calculate the wind chill
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        // Output the wind chill temperature
        System.out.println("The wind chill temperature is: " + windChill + "°F");
    }

    
}
