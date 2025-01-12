import java.util.Scanner;

public class Temperatureconversion2{

public static void main(String [] args){
	    // Scanner is used to take input from user
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit");
		// created the variables fehrenheit
		double fehrenheit= input.nextDouble();
		//Created variable Celsius Result and calculated
		double celsius = (fehrenheit - 32 ) *  (double) 5/(double)9 ;
		// display the output
		System.out.println("The" + fehrenheit+" fehrenheit is " + celsius +" celsius " );

}
}

