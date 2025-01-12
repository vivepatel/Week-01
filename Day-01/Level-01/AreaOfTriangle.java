import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[] args) {
        // we have created the Scanner object for taking inputs
        Scanner Input = new Scanner(System.in);

        
        System.out.println("Enter the base of the triangle in inches: ");
        double baseInches = Input.nextDouble();

        System.out.println("Enter the height of the triangle in inches: ");
        double heightInches = Input.nextDouble();

        // Calculate the area in square inches
        double areaInches = 0.5 * baseInches * heightInches;

        // Convert the area to square centimeters
        double areaCentimeters = areaInches * 6.4516; // 1 square inch = 6.4516 square centimeters

        System.out.println("The area of Triangle in Inches  and  Centimeter : "+ areaInches+" , "+areaCentimeters);
        
    }
}

