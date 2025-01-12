import java.util.Scanner;

public class IntOperations{
	public static void main( String[] args){
	 // created Scanner for taking input form user
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the a ,b and c.");
	 //created the Variables a b and c
	int  a = input.nextInt();
	int  b =input.nextInt();
	int  c =input.nextInt();
	//opteration Number 1 (a+b*c)
	int opteration1= a + b *c ;
	//opteration Number 2 (a * b + c)
	int  opteration2= a * b + c ;
	//opteration Number 3 ( c + a / b )
	int opteration3 = c + a / b;
	//opteration Number 4 (a % b + c )
	int opteration4 = a % b + c ;
	//display the output
	System.out.println("The results of Int Operations are "+ opteration1 + "," +opteration2+","+opteration3+" and "+ opteration4);
	
	
	}
}