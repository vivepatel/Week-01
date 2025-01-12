import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: weight in kilograms and height in centimeters
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightMeters * heightMeters);

        // Determine weight status based on BMI
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Output the BMI and weight status
        System.out.println("\n--- Results ---");
        System.out.printf("Your BMI: %.2f%n", bmi);
        System.out.println("Weight Status: " + status);
		}
	}