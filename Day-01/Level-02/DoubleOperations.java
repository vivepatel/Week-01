
import java.util.Scanner;

public class DoubleOperations{
	public static void main( String[] args){
	 // created Scanner for taking input form user
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the a ,b and c.");
	 //created the Variables a b and c
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	//opteration Number 1 (a+b*c)
	double opteration1= a + b *c ;
	//opteration Number 2 (a * b + c)
	double opteration2= a * b + c ;
	//opteration Number 3 ( c + a / b )
	double opteration3 = c + a / b;
	//opteration Number 4 (a % b + c )
	double opteration4 = a % b + c ;
	//display the output
	System.out.println("The results of Int Operations are "+ opteration1 + "," +opteration2+","+opteration3+" and "+ opteration4);
	
	
	}
}

