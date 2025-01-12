import java.util.Scanner;

public class BMI_Calculator {

    // Method to calculate the BMI for each person
    public static double[][] calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            // Convert height from cm to meters
            double heightInMeters = data[i][1] / 100;
            // BMI formula: weight / (height * height)
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
        return data;
    }

    // Method to determine the BMI status for each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 people, 3 columns: weight, height, BMI
        String[] status = new String[10];

        // Input data for each person
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight for person " + (i + 1) + " (in kg): ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height for person " + (i + 1) + " (in cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        data = calculateBMI(data);

        // Determine BMI status for each person
        status = determineBMIStatus(data);

        // Display the results
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI    | Status");
        for (int i = 0; i < data.length; i++) {
            System.out.printf(""+(i + 1) +"\t"+data[i][0] +"\t\t"+data[i][1] +"\t\t"+data[i][2] +"\t\t"+status[i] +"\n" );
        }

       
    }
}
