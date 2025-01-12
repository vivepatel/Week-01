import java.util.Scanner;

public class Calculation{
    public static void main(String[] args) {
        // we have created the Scanner object for taking inputs
        Scanner input= new Scanner(System.in);
		System.out.println("Enter the  Two Numbers ");
        // created the two Variables number1 and number2
		double number1= input.nextDouble();
		double number2 = input.nextDouble();
		// now we have to perform all the Arithmetic Opperation
		// created the variable  addition , subtraction and multiplication and division
		// we are performing the Addition operation 
   		double addition = number1 + number2;
		// we are performing the Subtraction operation
		double subtraction = number1 - number2;
		//  we are performing the Multiplication operation
		double multiplication = number1 * number2;
		// we are per the Division Opperation
		double division = number1/ number2;
		System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers"+number1+ " and "+number2+" is  " + addition+"," +subtraction + "," + multiplication+ "and"+ division);
		
    }
}