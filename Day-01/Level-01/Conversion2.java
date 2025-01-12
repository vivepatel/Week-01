import java.util.Scanner;

public class Conversion2 {
    public static void main(String[] args) {
        // we have created the Scanner object for taking inputs
        Scanner input= new Scanner(System.in);
        
		System.out.println(" Enter the Kilometers ");
		// Created the variable km for  Kilometers
        double Km= input.nextDouble(); 
        // Created the variable to store the value of miles
        double Miles= Km/1.6;
		System.out.println("The total Miles is " + Miles + " miles for  the given " + Km + " Km ");
        

    }
}

