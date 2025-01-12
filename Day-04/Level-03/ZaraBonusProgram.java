import java.util.Random;

public class ZaraBonusProgram {

    public static void main(String[] args) {
        // Define a 2D array to store the salary and years of service for 10 employees
        double[][] employeeData = new double[10][2];  // [][0] for salary, [][1] for years of service

        // Populate the array with random values for salary and years of service
        generateEmployeeData(employeeData);

        // Calculate new salaries and bonuses, and return a 2D array with new salaries and bonuses
        double[][] updatedEmployeeData = calculateBonusAndNewSalary(employeeData);

        // Calculate and display the total salary and bonus details
        displayTotalDetails(employeeData, updatedEmployeeData);
    }

    // Method to generate random salary and years of service for employees
    public static void generateEmployeeData(double[][] data) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // Random salary between 10000 and 99999
            data[i][0] = 10000 + (random.nextInt(90000));
            // Random years of service between 1 and 20 years
            data[i][1] = 1 + (random.nextInt(20));
        }
    }

    // Method to calculate the new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        double[][] updatedData = new double[10][3];  // [][0] old salary, [][1] years of service, [][2] new salary with bonus
        for (int i = 0; i < 10; i++) {
            double oldSalary = data[i][0];
            int yearsOfService = (int) data[i][1];

            // Calculate bonus and new salary based on years of service
            double bonus = 0;
            if (yearsOfService > 5) {
                bonus = 0.05 * oldSalary;  // 5% bonus for employees with more than 5 years of service
            } else {
                bonus = 0.02 * oldSalary;  // 2% bonus for employees with less than or equal to 5 years of service
            }

            // Calculate the new salary (old salary + bonus)
            double newSalary = oldSalary + bonus;

            // Store the old salary, years of service, and new salary with bonus in the updatedData array
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = yearsOfService;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    // Method to calculate and display the sum of old salary, new salary, and total bonus
    public static void displayTotalDetails(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Display the table header
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Employee", "Old Salary", "Years", "Bonus", "New Salary");

        // Loop through all employees to calculate totals and display their data
        for (int i = 0; i < 10; i++) {
            double oldSalary = oldData[i][0];
            int yearsOfService = (int) oldData[i][1];
            double newSalary = newData[i][2];
            double bonus = newSalary - oldSalary;

            // Display individual employee data
            System.out.printf("%-10d %-10.2f %-10d %-10.2f %-10.2f\n", i + 1, oldSalary, yearsOfService, bonus, newSalary);

            // Accumulate the totals
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        // Display the totals
        System.out.println();
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Amount: %.2f\n", totalBonus);
    }
}
