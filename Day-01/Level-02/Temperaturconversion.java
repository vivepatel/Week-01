import java.util.Scanner;

public class Temperaturconversion {
    public static void main(String[] args) {
        // Scanner is used to take input from user
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius");
        // Created variable celsius
        double celsius = input.nextDouble();
        //Created variable fahrenheit Result and calculated
        double farenheitResult =  ( celsius * (double) 9/(double) 5) +32;
        //  Display the output
        System.out.println(" The "+ celsius + " celsius is "+farenheitResult +" fahrenheit");
        
    }
}
