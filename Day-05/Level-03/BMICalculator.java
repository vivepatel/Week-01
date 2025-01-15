import java.util.Scanner;

public class BMICalculator {
    
    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeters = heightInCm / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            
            results[i][0] = String.format("%.2f", heightInCm);
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }
    
    // Method to display the BMI results
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        
        // Taking input for height and weight
        System.out.println("Enter the height (in cm) and weight (in kg) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            data[i][1] = scanner.nextDouble(); // Height in cm
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            data[i][0] = scanner.nextDouble(); // Weight in kg
        }
        
        // Calculating BMI and status
        String[][] results = calculateBMI(data);
        
        // Displaying the results
        displayResults(results);
        
       
    }
}
