import java.util.Scanner;

public class HigthConversion {
    public static void main(String[] args) {
        // we have created the Scanner object for taking inputs
        Scanner input= new Scanner(System.in);
		System.out.println("  Enter the height  in Cm");
        // we have created a variable heigthInCm 
		double heigthInCm=  input.nextDouble();
		// we have created a variable heigthInInch
		double heigthInInch = heigthInCm * 2.54 ;
		// we have created a variable higthInFoot 
		double heigthInFoot = heigthInInch * 12 ;
		System.out.println(" Your Heigth in cm is " + heigthInCm + " while in feet is" + heigthInFoot
		+ " and inches is " + heigthInFoot );
	      
    }
}